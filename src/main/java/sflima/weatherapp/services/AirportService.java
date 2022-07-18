package sflima.weatherapp.services;


import sflima.weatherapp.model.airport.Airport;

public interface AirportService extends CrudService<Airport, Long>{

    Airport getByName (String name);
    Airport getByIcao (String icao);

}
