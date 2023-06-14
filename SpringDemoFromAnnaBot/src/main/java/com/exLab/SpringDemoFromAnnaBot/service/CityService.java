package com.exLab.SpringDemoFromAnnaBot.service;

import com.exLab.SpringDemoFromAnnaBot.data.CityRepository;
import com.exLab.SpringDemoFromAnnaBot.data.dto.CityDTO;
import com.exLab.SpringDemoFromAnnaBot.models.City;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void saveCity(CityDTO cityDTO){
        cityRepository.save(new City(UUID.randomUUID(),
                cityDTO.getName(), cityDTO.getInfo()));
    }

    public String getNameOfCity(String nameOfCity){
        return cityRepository.findByName(nameOfCity).getName();
    }

    public String getInfoAboutCity(String nameOfCity){
        return cityRepository.findByName(nameOfCity).getInfo();

    }

}
