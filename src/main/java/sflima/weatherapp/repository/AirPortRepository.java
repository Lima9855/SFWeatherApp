package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sflima.weatherapp.model.airport.Airport;

import java.util.List;

@Repository
public interface AirPortRepository extends JpaRepository<Airport, Long> {

}
