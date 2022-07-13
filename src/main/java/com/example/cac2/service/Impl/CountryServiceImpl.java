package com.example.cac2.service.Impl;

import com.example.cac2.entity.Country;
import com.example.cac2.repository.CountryRepository;
import com.example.cac2.service.CountryService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    @Override
    public Country getCountryById(Long id) {
        return countryRepository.findById(id).get();
    }



}


