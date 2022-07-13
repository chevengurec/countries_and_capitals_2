package com.example.cac2;

import com.example.cac2.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CountryApplication.class, args);
    }

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public void run(String... args) throws Exception {



    }
}
