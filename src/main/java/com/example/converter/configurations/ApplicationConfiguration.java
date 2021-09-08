package com.example.converter.configurations;

import com.example.converter.converters.ContentToHotelDataConverter;
import com.example.converter.converters.ContentWrapperToHotelDataConverter;
import com.example.converter.converters.HotelDataToHotelDataResponseConverter;
import com.example.converter.converters.InputStreamToContentConverter;
import com.example.converter.converters.InputStreamToContentWrapperConverter;
import com.example.converter.converters.ResultToHotelDataConverter;
import com.example.converter.converters.HotelDataToHotelDataImagesResponseConverter;
import com.example.converter.converters.InputStreamToResultConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ConversionService conversionService() {
        final DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        conversionService.addConverter(new InputStreamToContentWrapperConverter(this.configuration()));
        conversionService.addConverter(new InputStreamToContentConverter(this.configuration()));
        conversionService.addConverter(new InputStreamToResultConverter(this.configuration()));

        conversionService.addConverter(new ResultToHotelDataConverter());
        conversionService.addConverter(new ContentToHotelDataConverter());
        conversionService.addConverter(new ContentWrapperToHotelDataConverter());

        conversionService.addConverter(new HotelDataToHotelDataImagesResponseConverter());
        conversionService.addConverter(new HotelDataToHotelDataResponseConverter());

        return conversionService;
    }

    @Bean
    public MapperConfiguration configuration() {
        return new MapperConfiguration();
    }
}
