package dev.akshaan.MovieFrenzy.controller;

import dev.akshaan.MovieFrenzy.dto.CityRequestDTO;
import dev.akshaan.MovieFrenzy.model.City;
import dev.akshaan.MovieFrenzy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO){
        try{
            String cityName = cityRequestDTO.getCityName();
            if(cityName == null || cityName.isEmpty() || cityName.isBlank()){
                throw new Exception("Invalid City name is given!!");
            }

            City createdCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(createdCity);

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @GetMapping("/city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName){
        City getCity = cityService.getCityByName(cityName);
        return ResponseEntity.ok(getCity);
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCityById(@PathVariable("id") int cityId){
        return ResponseEntity.ok(cityService.deleteCity(cityId));
    }
}
