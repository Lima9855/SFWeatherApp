package sflima.weatherapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.dto.airstation.airstationdata.measurementstation.MeasurementStationDto;
import sflima.weatherapp.mapper.MeasurementStationMapper;
import sflima.weatherapp.model.airstation.airstationdata.measurementstation.MeasurementStation;
import sflima.weatherapp.services.airstationservices.MeasurementStationService;
import sflima.weatherapp.services.apiservice.AirStationDataApiService;

@RestController
@RequestMapping("api/measurement_station")
public class MeasurementStationController {

    private final MeasurementStationService measurementStationService;

    private final MeasurementStationMapper measurementStationMapper;

    private final AirStationDataApiService airStationDataApiService;

    public MeasurementStationController(MeasurementStationService measurementStationService, MeasurementStationMapper measurementStationMapper, AirStationDataApiService airStationDataApiService) {
        this.measurementStationService = measurementStationService;
        this.measurementStationMapper = measurementStationMapper;
        this.airStationDataApiService = airStationDataApiService;
    }

    @PostMapping
    public ResponseEntity<?> createMeasurementStation(int id){
        MeasurementStation createdMeasurementData = measurementStationService.save(
                measurementStationMapper.dtoToEntity(airStationDataApiService.getMeasurementStation(id)));
        MeasurementStationDto result = measurementStationMapper.entityToDto(createdMeasurementData);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(result);
    }
}
