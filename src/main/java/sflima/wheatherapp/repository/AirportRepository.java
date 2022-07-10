package sflima.wheatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.wheatherapp.model.AirPort;

public interface AirportRepository extends CrudRepository<AirPort, Long> {
    AirPort findByName (String name);
    AirPort findByIcao (String icao);

}
