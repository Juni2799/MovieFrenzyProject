package dev.akshaan.MovieFrenzy.service;

import dev.akshaan.MovieFrenzy.model.City;
import dev.akshaan.MovieFrenzy.model.Theatre;
import dev.akshaan.MovieFrenzy.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;
    @Autowired
    private CityService cityService;

    public Theatre saveTheatre(String name, String address, int cityId){
        Theatre theatre = new Theatre();
        theatre.setName(name);
        theatre.setAddress(address);
        Theatre savedTheatre = theatreRepository.save(theatre);

        City city = cityService.getCityById(cityId);
        List<Theatre> cityTheatres = city.getTheatres();
        cityTheatres.add(savedTheatre);
        city.setTheatres(cityTheatres);
        cityService.saveCity(city);

        return savedTheatre;
    }
}
