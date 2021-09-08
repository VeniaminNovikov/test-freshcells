package com.example.converter.controllers;

import com.example.converter.exceptions.ConverterApplicationException;
import com.example.converter.facades.HotelDataServiceFacade;
import com.example.converter.models.responses.HotelDataImagesResponse;
import com.example.converter.models.responses.HotelDataResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.example.converter.constants.Constants.BASE_HOTELS_URI;

@RestController
@Api(value = "Api for acting on Hotel data")
@RequestMapping(value = BASE_HOTELS_URI)
public class HotelsController {
    private static final Logger LOG = LoggerFactory.getLogger(HotelsController.class);

    private final HotelDataServiceFacade hotelDataServiceFacade;

    public HotelsController(final HotelDataServiceFacade hotelDataServiceFacade) {
        this.hotelDataServiceFacade = hotelDataServiceFacade;
    }

    @ModelAttribute
    protected void logging(final HttpServletRequest request, final HttpServletResponse response) {
        LOG.debug("Endpoint called: {} {} {}", request.getMethod(), request.getRequestURI(), request.getQueryString() != null ? request.getQueryString() : "");
    }

    @GetMapping(value = "")
    @ApiOperation(value = "Get all available hotel data", response = HotelDataImagesResponse.class)
    public ResponseEntity<Page<HotelDataResponse>> getHotelData(@PageableDefault(sort = "name") final Pageable pageable)
            throws ConverterApplicationException {
        final Page<HotelDataResponse> dataResponse = this.hotelDataServiceFacade.getAll(pageable);
        LOG.debug("Data retrieved: {} of {} records in total", dataResponse.getContent().size(), dataResponse.getTotalElements());

        return ResponseEntity.ok(dataResponse);
    }

    @GetMapping(value = "/images")
    @ApiOperation(value = "Get all available hotel images", response = HotelDataImagesResponse.class)
    public ResponseEntity<Page<HotelDataImagesResponse>> getImages(@PageableDefault(sort = "name") final Pageable pageable)
            throws ConverterApplicationException {
        final Page<HotelDataImagesResponse> dataResponse = this.hotelDataServiceFacade.getAllImagesCombinedByHotelName(pageable);
        LOG.debug("Data retrieved: {} of {} records in total", dataResponse.getContent().size(), dataResponse.getTotalElements());

        return ResponseEntity.ok(dataResponse);
    }
}
