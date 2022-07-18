package com.example.cac2.service.Impl;

import com.example.cac2.entity.America;
import com.example.cac2.repository.AmericaRepository;
import com.example.cac2.repository.CountryRepository;
import com.example.cac2.service.AmericaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmericaServiceImpl implements AmericaService {

    private AmericaRepository americaRepository;

    public AmericaServiceImpl(AmericaRepository americaRepository) {
        super();
        this.americaRepository = americaRepository;
    }

    @Override
    public America getCountryById(Long id) {
        return americaRepository.findById(id).get();
    }

    @Override
    public List<America> getList() {
        return americaRepository.findAll();
    }
}
