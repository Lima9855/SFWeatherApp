package sflima.weatherapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sflima.weatherapp.dto.airportdata.AirPortDtoApi;
import sflima.weatherapp.mapper.AirPortMapper;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.services.airportservices.AirPortDataService;
import sflima.weatherapp.services.apiservice.AirPortApiService;
import sflima.weatherapp.services.airportservices.AirPortService;

import java.util.Set;

@RestController
@RequestMapping("/api/airport")
public class AirPortController {

    private final AirPortApiService airPortApiService;
    private final AirPortService airPortService;
    private final AirPortMapper airPortMapper;
    private final AirPortDataService airPortDataService;

    public AirPortController(AirPortApiService airPortApiService,
                             AirPortDataService airPortDataService,
                             AirPortService airPortService, AirPortMapper airPortMapper) {
        this.airPortApiService = airPortApiService;
        this.airPortService = airPortService;
        this.airPortMapper = airPortMapper;
        this.airPortDataService = airPortDataService;
    }

    @PostMapping ()
    public ResponseEntity<?> createAirport (String uri){
        AirPortDtoApi airPortDtoApi = airPortApiService.getAirport(uri);
        Airport airport = airPortMapper.dtoToEntity(airPortDtoApi);
        airPortService.saveAirPort(airport);
        return ResponseEntity.status(HttpStatus.OK)
                .body("airport created");
    }
    @PutMapping()
    public ResponseEntity<?> updateAirports(){
        Set<String> icaoCodes = airPortDataService.getSetOfIcaoCodes();
        for(String icao: icaoCodes){
            AirPortDtoApi airPortDtoApi = airPortApiService.getAirport(icao + "/decoded");
            Airport airport = airPortMapper.dtoToEntity(airPortDtoApi);
            boolean flag = airPortDataService.existsAirPortDataByIcaoAndObserved(airport.getAirPortData().getIcao(),airport.getAirPortData().getObserved());
            airPortService.updateAirPort(airport,flag);

        }
        return ResponseEntity.status(HttpStatus.OK)
                .body("airports updated");
    }
}
