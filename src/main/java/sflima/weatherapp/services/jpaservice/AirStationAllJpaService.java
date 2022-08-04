package sflima.weatherapp.services.jpaservice;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstationfindall.AirStationAll;
import sflima.weatherapp.repository.AirStationRepository;

import java.util.List;

@Service
public class AirStationAllJpaService {
    private final AirStationRepository airStationRepository;

    public AirStationAllJpaService(AirStationRepository airStationRepository) {
        this.airStationRepository = airStationRepository;
    }

    public List<AirStationAll> saveAll(List<AirStationAll> airStationAllList){
        return airStationRepository.saveAll(airStationAllList);
    }
}