package com.example.cac2.repository;

import com.example.cac2.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CityRepository extends JpaRepository<City, Long> {
}
