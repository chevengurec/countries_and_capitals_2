package com.example.cac2.service.Impl;

import com.example.cac2.entity.Country;
import com.example.cac2.repository.CountryRepository;
import com.example.cac2.service.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {


    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        super();
        this.countryRepository = countryRepository;
    }

    @Override
    public Country getCountryById(Long id) {

        return countryRepository.findById(id).get();
    }



}


