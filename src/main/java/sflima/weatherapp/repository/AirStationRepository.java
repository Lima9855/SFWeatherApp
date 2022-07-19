package sflima.weatherapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.model.airstation.AirStationAll;

import java.util.Optional;

public interface AirStationRepository extends JpaRepository<AirStationAll, Long> {

}
