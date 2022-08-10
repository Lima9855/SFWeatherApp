package sflima.weatherapp.services.airstationservices;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.airstationall.AirStationAll;
import sflima.weatherapp.repository.AirStationAllRepository;

import java.util.List;

@Service
public class AirStationAllService {
    private final AirStationAllRepository airStationAllRepository;

    public AirStationAllService(AirStationAllRepository airStationAllRepository) {
        this.airStationAllRepository = airStationAllRepository;
    }

    public AirStationAll getAirStationAllByID(Long id){
        return airStationAllRepository.getById(id);
    }

    public List<AirStationAll> getAirStationAll(){
        return airStationAllRepository.findAll();
    }

    public List<AirStationAll> getAirStationAllByCityName (String name){
        return airStationAllRepository.findByCity_Name(name);
    }
}
