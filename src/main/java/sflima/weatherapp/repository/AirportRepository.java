package sflima.weatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.weatherapp.model.airport.Airport;

import java.util.Optional;

public interface AirportRepository extends CrudRepository<Airport, Long> {

}
