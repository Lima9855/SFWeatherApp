package sflima.weatherapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.dto.airstation.airstationall.AirStationDto;
import sflima.weatherapp.mapper.AirStationMapper;
import sflima.weatherapp.model.airstation.airstationall.AirStation;
import sflima.weatherapp.services.airstationservices.AirStationService;
import sflima.weatherapp.services.apiservice.AirStationApiService;

import java.util.List;

@RestController
@RequestMapping("/api/air_station")
public class AirStationController {

    private final AirStationMapper mapper;
    private final AirStationApiService airStationApiService;
    private final AirStationService airStationService;

    public AirStationController(AirStationMapper mapper,
                                AirStationApiService airStationApiService
                                    , AirStationService airStationService) {
        this.mapper = mapper;
        this.airStationApiService = airStationApiService;
        this.airStationService = airStationService;
    }

    @PostMapping("/createListOfAirStations")
    public ResponseEntity<?> createListOfAirstations(){
        List<AirStationDto> airStaions = airStationApiService.getAirStations();
        for(AirStationDto dto: airStaions){
            boolean flag = airStationService.existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(dto.getAddressStreet()
                    , dto.getStationIdentyficator(),dto.getStationName());
            AirStation entity = mapper.dtoToEntity(dto);
            airStationService.updateAirStationAll(entity,flag);
        }

        return ResponseEntity.status(HttpStatus.OK)
                .body("created list of airstations" + airStaions );
    }



}
