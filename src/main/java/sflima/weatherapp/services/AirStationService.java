package sflima.weatherapp.services;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.AirStation;

import java.util.List;

@Service
public interface AirStationService extends CrudService<AirStation, Long> {

    AirStation getByStationName(String stationName);
    List<AirStation> saveAll(List<AirStation> airStationList);

}
