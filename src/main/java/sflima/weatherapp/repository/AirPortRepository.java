package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sflima.weatherapp.model.airport.Airport;

public interface AirPortRepository extends JpaRepository<Airport, Long> {
}
