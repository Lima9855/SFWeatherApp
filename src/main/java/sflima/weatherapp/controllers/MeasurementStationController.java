package sflima.weatherapp.controllers;

import io.github.jhipster.web.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sflima.weatherapp.dto.airstation.airstationdata.measurementdata.MeasurementDataDto;
import sflima.weatherapp.dto.airstation.airstationdata.measurementstation.MeasurementStationDto;
import sflima.weatherapp.mapper.MeasurementStationMapper;
import sflima.weatherapp.model.airstation.airstationdata.measurementdata.MeasurementData;
import sflima.weatherapp.model.airstation.airstationdata.measurementstation.MeasurementStation;
import sflima.weatherapp.services.airstationservices.MeasurementStationService;
import sflima.weatherapp.services.apiservice.AirStationDataApiService;
import sflima.weatherapp.utils.EntityAlertUtil;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public ResponseEntity<?> createMeasurementStation(final int id){
        MeasurementStation createdMeasurementData = measurementStationService.save(
                measurementStationMapper.dtoToEntity(airStationDataApiService.getMeasurementStation(id)));
        MeasurementStationDto result = measurementStationMapper.entityToDto(createdMeasurementData);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(result);
    }

    @GetMapping
    public ResponseEntity<?> getAllMeasurementStation(){
        List<MeasurementStationDto> result = measurementStationService.findAll().stream().map(measurementStationMapper::entityToDto).collect(Collectors.toList());
        return ResponseEntity.ok()
                .body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMeasurementStation(@PathVariable final Long id){
        Optional<MeasurementStationDto> result = measurementStationService.findById(id).map(measurementStationMapper::entityToDto);
        return ResponseUtil.wrapOrNotFound(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMeasurementStation(@PathVariable Long id){
        measurementStationService.delete(id);
        return ResponseEntity
                .noContent()
                .headers(EntityAlertUtil.createEntityDeletionAlert(MeasurementStation.class, id.toString()))
                .build();
    }
}
