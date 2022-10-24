package sflima.weatherapp.services.airstationservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.airstationall.AirStation;
import sflima.weatherapp.model.airstation.airstationdata.indexairquality.AirQualityIndex;
import sflima.weatherapp.repository.AirStationRepository;
import sflima.weatherapp.services.airportservices.AirPortService;

import java.util.List;

@Service
public class AirStationService {
    private final AirStationRepository airStationRepository;
    Logger logger = LoggerFactory.getLogger(AirPortService.class);

    public AirStationService(AirStationRepository airStationRepository) {
        this.airStationRepository = airStationRepository;
    }

    public AirStation save(AirStation airStation) {
        return airStationRepository.save(airStation);
    }

    public List<AirStation> saveAll(List<AirStation> airStationList) {
        return airStationRepository.saveAll(airStationList);
    }

    public AirStation getAirStationAllByID(Long id) {
        return airStationRepository.getById(id);
    }

    public List<AirStation> getAirStationAll() {
        return airStationRepository.findAll();
    }

    public List<AirStation> getAirStationAllByCityName(String name) {
        return airStationRepository.findByCity_Name(name);
    }

    public boolean existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(String addressStreet, Integer stationIdentyficator, String stationName) {
        return airStationRepository.existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(addressStreet, stationIdentyficator, stationName);
    }


    public void updateAirStationAll(AirStation airStation, boolean flag) {
        if (!flag) {
            airStationRepository.save(airStation);
        }
        // throw new app exception that will tell this
        else logger.info("There is already record in database for " + airStation.getStationName());
    }


    public void delete(Long id) {
        airStationRepository.deleteById(id);
    }
}
