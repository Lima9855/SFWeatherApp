package sflima.weatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.weatherapp.model.AirStation;

public interface AirStationRepository extends CrudRepository<AirStation,Long> {
    //AirStation findByStationId (int stationId);
    AirStation findByStationName (String stationName);
}
