package sflima.weatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.weatherapp.model.AirPort;

public interface AirportRepository extends CrudRepository<AirPort, Long> {
    AirPort findByName (String name);
    AirPort findByIcao (String icao);

}
