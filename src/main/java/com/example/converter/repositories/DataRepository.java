package com.example.converter.repositories;

import com.example.converter.exceptions.ConverterApplicationException;

import java.util.List;

public interface DataRepository<S, T> {

    List<T> getByExample(S pattern) throws ConverterApplicationException;

    List<T> getAll() throws ConverterApplicationException;
}
