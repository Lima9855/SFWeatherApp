package sflima.weatherapp.services.jpaservice;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airport.AirPortData;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.repository.AirPortRepository;

import java.util.List;

@Service
public class AirPortJpaService {
    private final AirPortRepository airPortRepository;

    public AirPortJpaService(AirPortRepository airPortRepository) {
        this.airPortRepository = airPortRepository;
    }

    public List<Airport> getAirports(){
        return airPortRepository.findAll();
    }

    public Airport saveAirPort (Airport airport){
        return airPortRepository.save(airport);
    }

    /*public Airport updateAirPort(Airport airport){
        List<Airport> airports = airPortRepository.findAll();
        if(airports.stream().anyMatch(airport1 -> airport1.getData().get(0) == airport.getData().get(0)))
        return airPortRepository.
    }*/
}
