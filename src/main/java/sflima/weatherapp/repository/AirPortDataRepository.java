package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sflima.weatherapp.model.airport.AirPortData;

@Repository
public interface AirPortDataRepository extends JpaRepository<AirPortData, Long> {

}
