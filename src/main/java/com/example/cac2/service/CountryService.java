package com.example.cac2.service;

import com.example.cac2.entity.Country;

import java.io.IOException;
import java.util.List;

public interface CountryService {

    public Country getCountryById(Long id);

    public List<Country> getList();



}
