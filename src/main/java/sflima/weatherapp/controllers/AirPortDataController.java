package sflima.weatherapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.dto.airport.AirPortDataDto;
import sflima.weatherapp.mapper.AirPortDataMapper;
import sflima.weatherapp.services.airportdataservices.AirPortDataService;

import java.util.List;
import java.util.Locale;

@RestController
public class AirPortDataController {

    private final AirPortDataService airPortDataService;
    private final AirPortDataMapper mapper;

    public AirPortDataController(AirPortDataService airPortDataService, AirPortDataMapper mapper) {
        this.airPortDataService = airPortDataService;
        this.mapper = mapper;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AirPortDataDto>> getAll(){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(mapper.entitiesToDtos(airPortDataService.getAirports()));
    }
    @GetMapping("/getByIcao")
    public ResponseEntity<List<AirPortDataDto>> getByIcao(String icao){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(mapper.entitiesToDtos(airPortDataService.getListOfAirPortDataByIcao(icao.toUpperCase(Locale.ROOT))));
    }

    @GetMapping("/getByStationName")
    public ResponseEntity<List<AirPortDataDto>> getByLocation(String name){
        return ResponseEntity.status(HttpStatus.OK)
                .body(mapper.entitiesToDtos(airPortDataService.getListOfAirPortDataByStationName(name)));
    }

    @GetMapping("/getByStationLocation")
    public ResponseEntity<List<AirPortDataDto>> getByStationLocation(String location){
        return ResponseEntity.status(HttpStatus.OK)
                .body(mapper.entitiesToDtos(airPortDataService.getListOfAirPortDataByLocation(location)));
    }

    @GetMapping("/getByObservationDate")
    public ResponseEntity <List<AirPortDataDto>> getByObservationDate(String date){
        return ResponseEntity.status(HttpStatus.OK)
                .body((mapper.entitiesToDtos(airPortDataService.getListOfAirPortDataByObserved(date))));
    }
}
