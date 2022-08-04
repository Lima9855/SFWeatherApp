package sflima.weatherapp.services;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstationfindall.AirStationAll;
import sflima.weatherapp.repository.AirStationRepository;

import java.util.List;

@Service
public class AirStationAllService {
    private final AirStationRepository airStationRepository;

    public AirStationAllService(AirStationRepository airStationRepository) {
        this.airStationRepository = airStationRepository;
    }

    public AirStationAll getAirStationAllByID(Long id){
        return airStationRepository.getById(id);
    }

    public List<AirStationAll> getAirStationAll(){
        return airStationRepository.findAll();
    }

    public List<AirStationAll> getAirStationAllByCityName (String name){
        return airStationRepository.findByCity_Name(name);
    }
}
