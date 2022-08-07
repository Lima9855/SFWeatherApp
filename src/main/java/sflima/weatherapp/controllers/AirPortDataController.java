package sflima.weatherapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.mapper.AirPortMapper;
import sflima.weatherapp.model.airport.AirPortData;
import sflima.weatherapp.services.AirPortDataService;

import java.util.List;
import java.util.Locale;

@RestController
public class AirPortDataController {

    private final AirPortDataService airPortDataService;
    private final AirPortMapper mapper;

    public AirPortDataController(AirPortDataService airPortDataService, AirPortMapper mapper) {
        this.airPortDataService = airPortDataService;
        this.mapper = mapper;
    }

    @GetMapping("/getAll")
    public List<AirPortData> getAll(){
        return airPortDataService.getAirports();
    }
    @GetMapping("/getByIcao")
    public List<AirPortData> getByIcao(String icao){
        String icaoCode = String.valueOf(new StringBuilder(icao.toUpperCase(Locale.ROOT)));
        return airPortDataService.getListOfAirPortDataByIcao(icaoCode);
    }

    @GetMapping("/getByStationName")
    public List<AirPortData> getByLocation(String name){
        return airPortDataService.getListOfAirPortDataByStationName(name);
    }

    @GetMapping("/getByStationLocation")
    public List<AirPortData> getByStationLocation(String location){

        return airPortDataService.getListOfAirPortDataByLocation(location);
    }
}
