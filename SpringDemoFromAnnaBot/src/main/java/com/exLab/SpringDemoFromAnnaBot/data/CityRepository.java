package com.exLab.SpringDemoFromAnnaBot.data;

import com.exLab.SpringDemoFromAnnaBot.models.City;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface CityRepository extends CrudRepository<City, UUID> {

    City findByName(String nameOfCity);
}
