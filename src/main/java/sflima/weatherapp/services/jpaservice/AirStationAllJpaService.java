package sflima.weatherapp.services.jpaservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.model.airstation.airstationall.AirStationAll;
import sflima.weatherapp.repository.AirStationAllRepository;

import java.util.List;

@Service
public class AirStationAllJpaService {
    private final AirStationAllRepository airStationAllRepository;
    Logger logger = LoggerFactory.getLogger(AirPortJpaService.class);

    public AirStationAllJpaService(AirStationAllRepository airStationAllRepository) {
        this.airStationAllRepository = airStationAllRepository;
    }

    public List<AirStationAll> saveAll(List<AirStationAll> airStationAllList){
        return airStationAllRepository.saveAll(airStationAllList);
    }

    public void updateAirStationAll(AirStationAll airStationAll, boolean flag){
        if(!flag){
            airStationAllRepository.save(airStationAll);
        }
        // throw new app exception that will tell this
        else logger.info("There is already record in database for " + airStationAll.getStationName());
    }
}