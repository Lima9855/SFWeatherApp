package sflima.weatherapp.services;

import sflima.weatherapp.model.AirStation;

public interface AirStationService extends CrudService<AirStation, Long> {

    AirStation findByStationId (int stationId);
    AirStation findByStationName (String stationName);

}
