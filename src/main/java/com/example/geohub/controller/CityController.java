/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.geohub.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.geohub.model.Country;
import com.example.geohub.service.CityJpaService;
import com.example.geohub.model.City;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CityController {

    @Autowired
    public CityJpaService cityService;

    @GetMapping("/cities")
    public ArrayList<City> getCities() {
        return cityService.getCities();
    }

    @GetMapping("/cities/{cityId}")
    public City getCityById(@PathVariable("cityId") int cityId) {
        return cityService.getCityById(cityId);
    }

    @PostMapping("/countries/cities")
    public City addCity(@RequestBody City city) {
        return cityService.addCity(city);
    }

    @PutMapping("/cities/{cityId}")
    public City updateCity(@PathVariable("cityId") int cityId, @RequestBody City city) {
        return cityService.updateCity(cityId, city);
    }

    @DeleteMapping("/cities/{cityId}")
    public void deleteCity(@PathVariable("cityId") int cityId) {
        cityService.deleteCity(cityId);
    }

    @GetMapping("/cities/{cityId}/country")
    public Country getCityCountry(@PathVariable("cityId") int cityId) {
        return cityService.getCityCountry(cityId);
    }
}