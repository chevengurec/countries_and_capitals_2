package com.example.cac2.controller;

import com.example.cac2.entity.America;
import com.example.cac2.repository.AmericaRepository;
import com.example.cac2.repository.CityRepository;
import com.example.cac2.service.AmericaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class AmericaController {

    private CityRepository cityRepository;


    private AmericaService americaService;

    private AmericaRepository americaRepository;

    List<America> listOfAmerica;

    America currentAmerica;


    public AmericaController(AmericaService americaService, AmericaRepository americaRepository, CityRepository cityRepository) {

        super();
        this.americaService = americaService;
        this.americaRepository = americaRepository;
        this.cityRepository = cityRepository;
    }


    @GetMapping("/america")
    public String startAmericaQuestions(Model model) {
        listOfAmerica = americaService.getList();
        Long id = ThreadLocalRandom.current().nextLong(1, listOfAmerica.size()+1);
        currentAmerica = americaService.getCountryById(id);
        String land = currentAmerica.getCountry();
        model.addAttribute("message", land);
        return "america";
    }

    @PostMapping("/america")
    public String getAmericaAnswer(@RequestParam String answer, Model model) {
        America america = new America(answer);
        if (america.getCapital().equals(currentAmerica.getCapital())) {
            return "redirect:/america";
        } else return "redirect:/greeting";




    }

}
