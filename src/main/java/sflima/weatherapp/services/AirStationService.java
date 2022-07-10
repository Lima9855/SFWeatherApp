package sflima.weatherapp.services;

import sflima.weatherapp.model.AirStation;

import java.util.List;

public interface AirStationService extends CrudService<AirStation, Long> {

    AirStation findByStationId (int stationId);
    AirStation findByStationName (String stationName);
    /*AirStation saveAll(List<AirStation> airStationList);*/

}
