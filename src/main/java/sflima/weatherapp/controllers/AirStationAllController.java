package sflima.weatherapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.dto.airstation.airstationall.AirStationAllDto;
import sflima.weatherapp.mapper.AirStationMapper;
import sflima.weatherapp.model.airstation.airstationall.AirStationAll;
import sflima.weatherapp.services.airstationservices.AirStationAllService;
import sflima.weatherapp.services.apiservice.AirStationApiService;
import sflima.weatherapp.services.jpaservice.AirStationAllJpaService;

import java.util.List;

@RestController
public class AirStationAllController {

    private final AirStationMapper mapper;
    private final AirStationAllJpaService airStationAllJpaService;
    private final AirStationApiService airStationApiService;
    private final AirStationAllService airStationAllService;

    public AirStationAllController(AirStationMapper mapper,
                                   AirStationAllJpaService airStationAllJpaService, AirStationApiService airStationApiService
                                    ,AirStationAllService airStationAllService) {
        this.mapper = mapper;
        this.airStationAllJpaService = airStationAllJpaService;
        this.airStationApiService = airStationApiService;
        this.airStationAllService = airStationAllService;
    }

    @PutMapping("/putListOfAirStations")
    public ResponseEntity<?> putListOfAirstations(){
        List<AirStationAllDto> airStaions = airStationApiService.getAirStations();
        for(AirStationAllDto dto: airStaions){
            boolean flag = airStationAllService.existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(dto.getAddressStreet()
                    , dto.getStationIdentyficator(),dto.getStationName());
            AirStationAll entity = mapper.dtoToEntity(dto);
            airStationAllJpaService.updateAirStationAll(entity,flag);
        }

        return ResponseEntity.status(HttpStatus.OK)
                .body("created list of airstations" + airStaions );
    }



}
