package sflima.weatherapp.services;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.AirStationAll;

import java.util.List;

@Service
public interface AirStationService extends CrudService<AirStationAll, Long> {

    AirStationAll getByStationName(String stationName);
    List<AirStationAll> saveAll(List<AirStationAll> airStationList);

}
