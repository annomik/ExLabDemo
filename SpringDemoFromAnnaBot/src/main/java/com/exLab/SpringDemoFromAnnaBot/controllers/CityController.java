package com.exLab.SpringDemoFromAnnaBot.controllers;

import com.exLab.SpringDemoFromAnnaBot.data.dto.CityDTO;
import com.exLab.SpringDemoFromAnnaBot.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/city")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping
    public ResponseEntity<?> addNewCity(@RequestBody CityDTO cityDTO){
        cityService.saveCity(cityDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
