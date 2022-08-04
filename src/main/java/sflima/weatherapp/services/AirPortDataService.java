package sflima.weatherapp.services;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airport.AirPortData;
import sflima.weatherapp.repository.AirPortDataRepository;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class AirPortDataService {

    private final AirPortDataRepository airportDataRepository;

    public AirPortDataService(AirPortDataRepository airportDataRepository) {
        this.airportDataRepository = airportDataRepository;
    }


    public List<AirPortData> getAirports(){
        return airportDataRepository.findAll();
    }

    public AirPortData getAirportDataByID(Long id){
        return airportDataRepository.getById(id);
    }

    public List<AirPortData> getListOfAirPortDataByIcao(String icao){
        return airportDataRepository.findByIcao(icao);
    }

    public List<AirPortData> getListOfAirPortDataByTemperatureCelsius(Integer temp){
        return airportDataRepository.findByTemperature_CelsiusTemperature(temp);
    }

    public List<AirPortData> getListOfAirPortDataByLocation(String location){
        return airportDataRepository.findAll().stream().filter(o -> o.getStation().getLocation().contains(location)).collect(Collectors.toList());
    }

    public List<AirPortData> getListOfAirPortDataByStationName(String name){
        List<AirPortData> test = airportDataRepository.findAll();
        return test.stream().filter(o -> o.getStation().getName().contains(name)).collect(Collectors.toList());
    }
}
