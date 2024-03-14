package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    public City findCityByCityName(String cityName);
}
