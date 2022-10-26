package sflima.weatherapp.services.airstationservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sflima.weatherapp.errors.BadRequestAlertException;
import sflima.weatherapp.model.airstation.airstationall.AirStation;
import sflima.weatherapp.model.airstation.airstationdata.indexairquality.AirQualityIndex;
import sflima.weatherapp.repository.AirStationRepository;
import sflima.weatherapp.services.airportservices.AirPortService;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public Optional<AirStation> findById(Long id){
        return airStationRepository.findById(id);
    }

    public List<AirStation> findAll() {
        return airStationRepository.findAll();
    }

    public List<AirStation> getAirStationAllByCityName(String name) {
        return airStationRepository.findByCity_Name(name);
    }

    public boolean existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(String addressStreet, Integer stationIdentyficator, String stationName) {
        return airStationRepository.existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(addressStreet, stationIdentyficator, stationName);
    }


    public void updateAirStation(AirStation airStation, boolean flag) {
        if (!flag) {
            airStationRepository.save(airStation);
        }
        // throw new app exception that will tell this
        else logger.info("There is already record in database for " + airStation.getStationName());
    }
    public AirStation updateById(AirStation airStation, Long id) {
        if (airStation.getId() == null) {
            throw new BadRequestAlertException("Invalid id", AirStation.class, "id null");
        }
        if (!Objects.equals(id, airStation.getId())) {
            throw new BadRequestAlertException("Invalid ID", AirStation.class, "id invalid");
        }
        if (!airStationRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", AirStation.class, "id not found");
        }
        logger.debug("Request to save Dimensions : {}", airStation);
        return airStationRepository.save(airStation);
    }


    public void delete(Long id) {
        airStationRepository.deleteById(id);
    }
}
