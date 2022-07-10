package sflima.wheatherapp.services;

import sflima.wheatherapp.model.AirStation;

public interface AirStationService extends CrudService<AirStation, Long> {

    AirStation findByStationId (int stationId);
    AirStation findByStationName (String stationName);

}
