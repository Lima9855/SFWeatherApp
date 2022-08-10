package sflima.weatherapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.dto.airstation.airstationall.AirStationAllDto;
import sflima.weatherapp.mapper.AirStationMapper;
import sflima.weatherapp.services.apiservice.AirStationApiService;
import sflima.weatherapp.services.jpaservice.AirStationAllJpaService;

import java.util.List;

@RestController
public class AirStationAllController {

    private final AirStationMapper mapper;
    private final AirStationAllJpaService airStationAllJpaService;
    private final AirStationApiService airStationApiService;

    public AirStationAllController(AirStationMapper mapper,
                                   AirStationAllJpaService airStationAllJpaService, AirStationApiService airStationApiService) {
        this.mapper = mapper;
        this.airStationAllJpaService = airStationAllJpaService;
        this.airStationApiService = airStationApiService;
    }

    @PutMapping("/putListOfAirStations")
    public ResponseEntity<?> putListOfAirstations(){
        List<AirStationAllDto> airStaions = airStationApiService.getAirStations();
        airStationAllJpaService.saveAll(mapper.dtosToEntities(airStaions));

        return ResponseEntity.status(HttpStatus.OK)
                .body("created list of airstations" + airStaions );
    }



}
