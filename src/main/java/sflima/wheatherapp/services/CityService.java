package sflima.wheatherapp.services;

import sflima.wheatherapp.model.City;

public interface CityService extends CrudService<City,Long>{
    City findByCityId (int cityIdentyficator);
    City findByCityName (String cityName);
}
