package sflima.weatherapp.services.jpaservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airport.AirPortData;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.repository.AirPortRepository;

import java.util.List;
import java.util.Objects;

@Service
public class AirPortJpaService {
    private final AirPortRepository airPortRepository;
    Logger logger = LoggerFactory.getLogger(AirPortJpaService.class);

    public AirPortJpaService(AirPortRepository airPortRepository) {
        this.airPortRepository = airPortRepository;
    }

    public List<Airport> getAirports(){
        return airPortRepository.findAll();
    }

    public Airport saveAirPort (Airport airport){
        return airPortRepository.save(airport);
    }

    public void updateAirPort(Airport airport, boolean flag){
        if(!flag){
            airPortRepository.save(airport);
        }
        // throw new app exception that will tell this
        else logger.info("There is already record in database for " + airport.getData().get(0).getStation().getName() + " observed: "+ '\n' + airport.getData().get(0).getObserved());
    }

}
