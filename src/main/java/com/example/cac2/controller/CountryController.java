package com.example.cac2.controller;

import com.example.cac2.entity.City;
import com.example.cac2.entity.Country;
import com.example.cac2.repository.CityRepository;
import com.example.cac2.repository.CountryRepository;
import com.example.cac2.service.CountryService;
import com.example.cac2.service.Impl.CountryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class CountryController {

    private CountryService countryService;
    private CountryRepository countryRepository;
    private CityRepository cityRepository;


    public CountryController(CountryService countryService, CountryRepository countryRepository, CityRepository cityRepository) {

        super();
        this.countryService = countryService;
        this.countryRepository = countryRepository;
        this.cityRepository = cityRepository;
    }


    @GetMapping("/greeting")
    public String showGreeting() {

        return "greeting";

    }

    @GetMapping("/questions")
    public String startQuestions(Model model) {
        List<Country> listOfCountries = countryService.getList();
        Long id = ThreadLocalRandom.current().nextLong(1, listOfCountries.size()+1);
        Country currentCountry = countryService.getCountryById(id);
        String land = currentCountry.getCountry();
        model.addAttribute("message", land);
        return "questions";
    }

    @PostMapping("/questions")
    public String getAnswer(@RequestParam String answer, Model model) {
        Country country = new Country(answer);
        if (country.getCapital().equals("Berlin")) {
            return "redirect:/questions";
        } else return "redirect:/greeting";

    }



}
