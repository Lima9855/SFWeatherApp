package sflima.weatherapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.dto.airstation.airstationdata.indexairquality.AirQualityIndexDto;
import sflima.weatherapp.mapper.AirQualityIndexMapper;
import sflima.weatherapp.model.airstation.airstationdata.indexairquality.AirQualityIndex;
import sflima.weatherapp.services.airstationservices.AirQualityIndexService;
import sflima.weatherapp.services.apiservice.AirStationDataApiService;

import java.net.URI;

@RestController
@RequestMapping("/api/air_quality")
public class AirQualityIndexController {


    private final AirStationDataApiService airStationDataApiService;
    private final AirQualityIndexService airQualityIndexService;
    private final AirQualityIndexMapper airQualityIndexMapper;

    public AirQualityIndexController(AirStationDataApiService airStationDataApiService, AirQualityIndexService airQualityIndexService, AirQualityIndexMapper airQualityIndexMapper) {
        this.airStationDataApiService = airStationDataApiService;
        this.airQualityIndexService = airQualityIndexService;
        this.airQualityIndexMapper = airQualityIndexMapper;

    }

    @PostMapping
    public ResponseEntity<?> createAirQualityIndex(int id){
        AirQualityIndex createdAirQualityIndex = airQualityIndexService.save(
                airQualityIndexMapper.dtoToEntity(airStationDataApiService.getAirQualityIndex(id)));
        AirQualityIndexDto result = airQualityIndexMapper.entityToDto(createdAirQualityIndex);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(result);
    }


}
