package com.example.cac2.repository;

import com.example.cac2.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}