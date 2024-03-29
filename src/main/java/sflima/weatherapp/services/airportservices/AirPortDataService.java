package sflima.weatherapp.services.airportservices;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airport.AirPortData;
import sflima.weatherapp.repository.AirPortDataRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AirPortDataService {

    private final AirPortDataRepository airportDataRepository;

    public AirPortDataService(AirPortDataRepository airportDataRepository) {
        this.airportDataRepository = airportDataRepository;
    }
    public Optional<AirPortData> findOne(Long id){
        return airportDataRepository.findById(id);
    }


    public List<AirPortData> getAirports(){
        return airportDataRepository.findAll();
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
        return airportDataRepository.findAll().stream().filter(o -> o.getStation().getName().contains(name)).collect(Collectors.toList());
    }
    public List<AirPortData> getListOfAirPortDataByObserved(String observed){
        return airportDataRepository.findAll().stream().filter(airPortData -> airPortData.getObserved().contains(observed) ).collect(Collectors.toList());
    }
    public Set<String> getSetOfIcaoCodes(){
        return airportDataRepository.findAll().stream().map(AirPortData::getIcao).collect(Collectors.toSet());
    }

    public boolean existsAirPortDataByIcaoAndObserved (String icao, String observed){
        return airportDataRepository.existsAirPortDataByIcaoAndObserved(icao,observed);
    }

    public void deleteById(Long id){
        airportDataRepository.deleteById(id);
    }


}
