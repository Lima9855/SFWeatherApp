package sflima.weatherapp.services.jpaservice;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airport.AirPort;
import sflima.weatherapp.repository.AirPortRepository;

import java.util.List;

@Service
public class AirPortJpaService {

    private final AirPortRepository airportRepository;

    public AirPortJpaService(AirPortRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<AirPort> getAirports(){
        return airportRepository.findAll();
    }

    public AirPort getAirportByID(Long id){
        return airportRepository.getById(id);
    }

    public AirPort saveAirport(AirPort airport){
        return airportRepository.save(airport);
    }
}
