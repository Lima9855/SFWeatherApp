package sflima.weatherapp.services;

import sflima.weatherapp.model.City;

public interface CityService extends CrudService<City,Long>{
    City findByCityId (int cityIdentyficator);
    City findByCityName (String cityName);
}
