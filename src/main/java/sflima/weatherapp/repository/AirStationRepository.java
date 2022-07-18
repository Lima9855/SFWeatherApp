package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sflima.weatherapp.model.AirStation;

public interface AirStationRepository extends JpaRepository<AirStation, Long> {
    //AirStation findByStationId (int stationId);
    AirStation findByStationName (String stationName);
}
