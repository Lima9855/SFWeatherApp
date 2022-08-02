package sflima.weatherapp.services.jpaservice;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airport.AirPortData;
import sflima.weatherapp.repository.AirPortDataRepository;

import java.util.List;

@Service
public class AirPortDataJpaService {

    private final AirPortDataRepository airportDataRepository;

    public AirPortDataJpaService(AirPortDataRepository airportDataRepository) {
        this.airportDataRepository = airportDataRepository;
    }


    public List<AirPortData> getAirports(){
        return airportDataRepository.findAll();
    }

    public AirPortData getAirportDataByID(Long id){
        return airportDataRepository.getById(id);
    }

    public AirPortData saveAirportData(AirPortData airPortData){
        if(airPortData.equals(null)){
           throw new RuntimeException(" null data");
        }
        return airportDataRepository.save(airPortData);
    }
}
