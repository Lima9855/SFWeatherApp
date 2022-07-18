package sflima.weatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.weatherapp.model.airport.Airport;

public interface AirportRepository extends CrudRepository<Airport, Long> {
    Airport findByName (String name);
    Airport findByIcao (String icao);

}
