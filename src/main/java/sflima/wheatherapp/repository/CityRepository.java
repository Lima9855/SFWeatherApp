package sflima.wheatherapp.repository;

import org.springframework.data.repository.CrudRepository;

import sflima.wheatherapp.model.City;

public interface CityRepository extends CrudRepository<City,Long> {
    City findByCityIdentyficator (int cityIdentyficator);
    City findByCityName (String cityName);
}
