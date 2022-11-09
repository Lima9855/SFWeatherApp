package sflima.weatherapp.controllers;

import io.github.jhipster.web.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sflima.weatherapp.dto.airstation.airstationdata.measurementdata.MeasurementDataDto;
import sflima.weatherapp.mapper.MeasurementDataMapper;
import sflima.weatherapp.model.airstation.airstationdata.measurementdata.MeasurementData;
import sflima.weatherapp.services.airstationservices.MeasurementDataService;
import sflima.weatherapp.services.apiservice.AirStationDataApiService;
import sflima.weatherapp.utils.EntityAlertUtil;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/measurement_data")
public class MeasurementDataController {

    private final MeasurementDataService measurementDataService;

    private final MeasurementDataMapper measurementDataMapper;

    private final AirStationDataApiService airStationDataApiService;

    public MeasurementDataController(MeasurementDataService measurementDataService, MeasurementDataMapper measurementDataMapper, AirStationDataApiService airStationDataApiService) {
        this.measurementDataService = measurementDataService;
        this.measurementDataMapper = measurementDataMapper;
        this.airStationDataApiService = airStationDataApiService;
    }

    @PostMapping
    public ResponseEntity<?> createMeasurementData(final int id) {
        MeasurementData createdMeasurementData = measurementDataService.save(
                measurementDataMapper.dtoToEntity(airStationDataApiService.getMeasurementData(id)));
        MeasurementDataDto result = measurementDataMapper.entityToDto(createdMeasurementData);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(result);
    }

    @GetMapping
    public ResponseEntity<?> getAllMeasurementData() {
        List<MeasurementDataDto> result = measurementDataService.findAll().stream().map(measurementDataMapper::entityToDto).collect(Collectors.toList());
        return ResponseEntity.ok()
                .body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMeasurementData(@PathVariable Long id) {
        Optional<MeasurementDataDto> result = measurementDataService.findById(id).map(measurementDataMapper::entityToDto);
        return ResponseUtil.wrapOrNotFound(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMeasurementData(@PathVariable Long id) {
        measurementDataService.delete(id);
        return ResponseEntity
                .noContent()
                .headers(EntityAlertUtil.createEntityDeletionAlert(MeasurementData.class, id.toString()))
                .build();
    }

}
