package com.example.cac2.service;

import com.example.cac2.entity.America;


import java.util.List;

public interface AmericaService {

    public America getCountryById(Long id);

    public List<America> getList();

}
