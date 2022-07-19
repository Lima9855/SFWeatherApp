package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sflima.weatherapp.model.airport.AirPort;

@Repository
public interface AirPortRepository extends JpaRepository<AirPort, Long> {

}
