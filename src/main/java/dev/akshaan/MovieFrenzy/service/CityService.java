package dev.akshaan.MovieFrenzy.service;

import dev.akshaan.MovieFrenzy.model.City;
import dev.akshaan.MovieFrenzy.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(City city){
        return cityRepository.save(city);
    }

    public City saveCity(String cityName){
        City city = new City();
        city.setCityName(cityName);
        return cityRepository.save(city);
    }

    public City getCityById(int cityId){
        return cityRepository.findById(cityId).get(); //findById() --> returns Optional<T> so had to use get() method as well
    }

    public City getCityByName(String cityName){
        return cityRepository.findCityByCityName(cityName);
    }

    public boolean deleteCity(int cityId){
        cityRepository.deleteById(cityId);
        return true;
    }
}
