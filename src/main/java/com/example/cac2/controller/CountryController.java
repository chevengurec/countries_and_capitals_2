package com.example.cac2.controller;

import com.example.cac2.entity.City;
import com.example.cac2.repository.CityRepository;
import com.example.cac2.repository.CountryRepository;
import com.example.cac2.service.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("message", "Germany");
        return "questions";
    }


    @PostMapping("/questions")
    public String getAnswer(@RequestParam String answer, Model model) {
        City city = new City(answer);
        cityRepository.save(city);
        return "redirect:/questions";
    }



//    @GetMapping("/checkAnswer")
//    public String checkCorrectAnswerOrNot(@PathVariable Long id,
//                                          @ModelAttribute("country") Country country,
//                                          Model model) {
//
//        Country currentCountry = countryService.getCountryById(id);
//        String currentCapital = currentCountry.getCapital();
//        if (currentCapital.equals("1")) {
//            return "greeting";
//        } else return "questions";
//    }


}
