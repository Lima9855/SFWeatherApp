package sflima.weatherapp.repository;

import org.springframework.data.repository.CrudRepository;

import sflima.weatherapp.model.City;

public interface CityRepository extends CrudRepository<City,Long> {
   // City findByCityIdentyficator (int cityIdentyficator);
    City findByName (String name);
}
