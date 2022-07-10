package sflima.weatherapp.services;

import sflima.weatherapp.model.AirPort;

public interface AirportService extends CrudService<AirPort, Long>{

    AirPort findByName (String name);
    AirPort findByIcao (String icao);

}
