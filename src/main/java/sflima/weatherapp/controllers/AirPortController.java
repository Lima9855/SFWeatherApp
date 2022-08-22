package sflima.weatherapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.dtoapi.airport.AirPortDtoApi;
import sflima.weatherapp.mapper.AirPortMapper;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.services.airportdataservices.AirPortDataService;
import sflima.weatherapp.services.apiservice.AirPortApiService;
import sflima.weatherapp.services.jpaservice.AirPortJpaService;

import java.util.Set;

@RestController
public class AirPortController {

    private final AirPortApiService airPortApiService;
    private final AirPortJpaService airPortJpaService;
    private final AirPortMapper airPortMapper;
    private final AirPortDataService airPortDataService;

    public AirPortController(AirPortApiService airPortApiService,
                             AirPortDataService airPortDataService,
                             AirPortJpaService airPortJpaService, AirPortMapper airPortMapper) {
        this.airPortApiService = airPortApiService;
        this.airPortJpaService = airPortJpaService;
        this.airPortMapper = airPortMapper;
        this.airPortDataService = airPortDataService;
    }

    @PutMapping("/putAirport")
    public ResponseEntity<?> createAirport (String uri){
        AirPortDtoApi airPortDtoApi = airPortApiService.getAirport(uri);
        Airport airport = airPortMapper.dtoToEntity(airPortDtoApi);
        airPortJpaService.saveAirPort(airport);
        return ResponseEntity.status(HttpStatus.OK)
                .body("airport created");
    }
    @PutMapping("/updateExistingAirPorts") //to add: statement that search for existing record in data base
                                            //that is the same as one that comes from request
    public ResponseEntity<?> updateAirports(){
        Set<String> icaoCodes = airPortDataService.getSetOfIcaoCodes();
        for(String icao: icaoCodes){
            AirPortDtoApi airPortDtoApi = airPortApiService.getAirport(icao + "/decoded");
            Airport airport = airPortMapper.dtoToEntity(airPortDtoApi);
            boolean flag = airPortDataService.existsAirPortDataByIcaoAndObserved(airport.getAirPortData().getIcao(),airport.getAirPortData().getObserved());
            airPortJpaService.updateAirPort(airport,flag);

        }
        return ResponseEntity.status(HttpStatus.OK)
                .body("airports updated");

    }
}
