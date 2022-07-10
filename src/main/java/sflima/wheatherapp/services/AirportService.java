package sflima.wheatherapp.services;

import sflima.wheatherapp.model.AirPort;

public interface AirportService extends CrudService<AirPort, Long>{

    AirPort findByName (String name);
    AirPort findByIcao (String icao);

}
