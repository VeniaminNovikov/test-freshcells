package com.example.converter.repositories.impl;

import com.example.converter.configurations.ResourceConfiguration;
import com.example.converter.exceptions.ConverterApplicationException;
import com.example.converter.models.HotelData;
import com.example.converter.models.objects.json.coah.Content;
import com.example.converter.models.objects.json.coah.ContentWrapper;
import com.example.converter.models.objects.json.giata.Result;
import com.example.converter.repositories.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.converter.constants.Messages.DATASOURCE_NOT_FOUND;

@Repository
public class ResourceToHotelDataRepositoryAdapter implements DataRepository<String, HotelData> {
    private static final Logger LOG = LoggerFactory.getLogger(ResourceToHotelDataRepositoryAdapter.class);

    private static final Map<String, Class<?>> EXAMPLES_TO_DERIVED_CLASSES_MAP = new HashMap<String, Class<?>>() {{
        put("*-giata.xml", Result.class);
        put("*-coah.xml", Content.class);
        put("*-coah.json", ContentWrapper.class);
    }};

    private final ResourceConfiguration resourceConfiguration;
    private final ResourceLoader resourceLoader;
    private final ConversionService conversionService;

    public ResourceToHotelDataRepositoryAdapter(final ResourceConfiguration resourceConfiguration,
                                                final ResourceLoader resourceLoader,
                                                final ConversionService conversionService) {
        this.resourceConfiguration = resourceConfiguration;
        this.resourceLoader = resourceLoader;
        this.conversionService = conversionService;
    }

    @Override
    public List<HotelData> getByExample(final String pattern) throws ConverterApplicationException {
        final Class<?> resultClass = EXAMPLES_TO_DERIVED_CLASSES_MAP.get(pattern);
        final List<HotelData> hotelData = this.parseResources(this.getResources(pattern), resultClass);
        LOG.debug("HotelData retrieved: {}", hotelData);
        return hotelData;
    }

    @Override
    public List<HotelData> getAll() throws ConverterApplicationException {
        final List<HotelData> resultList = new ArrayList<>();
        for (final Map.Entry<String, Class<?>> entry : EXAMPLES_TO_DERIVED_CLASSES_MAP.entrySet()) {
            resultList.addAll(this.getByExample(entry.getKey()));
        }
        return resultList;
    }

    @SuppressWarnings("java:S3864")
    private <T> List<HotelData> parseResources(final Stream<Resource> resources, final Class<T> conversionClass) {
        return resources
            .peek(val -> LOG.debug("Data retrieved: {}", val.getFilename()))
            .map(resource -> this.convertResources(resource, conversionClass))
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    }

    private <T> HotelData convertResources(Resource resource, final Class<T> conversionClass) {
        try {
            final InputStream inputStream = resource.getInputStream();
            final T conversionResult = this.conversionService.convert(inputStream, conversionClass);
            if (conversionResult != null) {
                return this.conversionService.convert(conversionResult, HotelData.class);
            }
        } catch (IOException e) {
            LOG.warn("Unable to convert: {}", resource.getFilename());
        }
        return null;
    }

    private Stream<Resource> getResources(final String pattern) throws ConverterApplicationException {
        final String dataSource = "file:" + this.resourceConfiguration.getDataSource() + pattern;
        try {
            final Resource[] resources = ResourcePatternUtils.getResourcePatternResolver(this.resourceLoader).getResources(dataSource);
            return Stream.of(resources)
                .filter(obj -> Objects.nonNull(obj.getFilename()))
                .sorted(Comparator.comparing(a -> a.getFilename().toLowerCase()));
        } catch (IOException e) {
            throw new ConverterApplicationException(DATASOURCE_NOT_FOUND);
        }
    }
}
