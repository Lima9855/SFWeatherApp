package sflima.wheatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.wheatherapp.model.AirStation;

public interface AirStationRepository extends CrudRepository<AirStation,Long> {
    AirStation findByStationId (int stationId);
    AirStation findByStationName (String stationName);
}
