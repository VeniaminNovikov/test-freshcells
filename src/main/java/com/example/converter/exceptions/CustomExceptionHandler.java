package com.example.converter.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class CustomExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

    /**
     * Exception handler
     *
     * @param e exception caught
     * @param request web request
     * @return response entity with error message
     */
    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Object> handleException(final Exception e, final WebRequest request) {
        LOG.error("Exception error has occurred.", e);
        final String endpointResponse = e.getMessage();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON).body(endpointResponse);
    }

    /**
     * Application specific exceptions handler
     *
     * @param e exception caught
     * @param request web request
     * @return response entity with error message
     */
    @ExceptionHandler({ ConverterApplicationException.class })
    public final ResponseEntity<Object> handleConverterApplicationException(final ConverterApplicationException e, final WebRequest request) {
        LOG.error("ConverterApplication Exception error has occurred.", e);
        final String endpointResponse = e.getMessage();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON).body(endpointResponse);
    }
}
