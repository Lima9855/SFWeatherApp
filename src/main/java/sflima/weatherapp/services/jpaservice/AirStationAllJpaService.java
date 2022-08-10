package sflima.weatherapp.services.jpaservice;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.airstationall.AirStationAll;
import sflima.weatherapp.repository.AirStationAllRepository;

import java.util.List;

@Service
public class AirStationAllJpaService {
    private final AirStationAllRepository airStationAllRepository;

    public AirStationAllJpaService(AirStationAllRepository airStationAllRepository) {
        this.airStationAllRepository = airStationAllRepository;
    }

    public List<AirStationAll> saveAll(List<AirStationAll> airStationAllList){
        return airStationAllRepository.saveAll(airStationAllList);
    }
}