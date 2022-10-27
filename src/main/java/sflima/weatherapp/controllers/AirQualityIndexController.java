package sflima.weatherapp.controllers;

import io.github.jhipster.web.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sflima.weatherapp.dto.airstation.airstationdata.indexairquality.AirQualityIndexDto;
import sflima.weatherapp.dto.airstation.airstationdata.measurementdata.MeasurementDataDto;
import sflima.weatherapp.mapper.AirQualityIndexMapper;
import sflima.weatherapp.model.airstation.airstationdata.indexairquality.AirQualityIndex;
import sflima.weatherapp.model.airstation.airstationdata.measurementdata.MeasurementData;
import sflima.weatherapp.services.airstationservices.AirQualityIndexService;
import sflima.weatherapp.services.apiservice.AirStationDataApiService;
import sflima.weatherapp.utils.EntityAlertUtil;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public ResponseEntity<?> createAirQualityIndex(final int id){
        AirQualityIndex createdAirQualityIndex = airQualityIndexService.save(
                airQualityIndexMapper.dtoToEntity(airStationDataApiService.getAirQualityIndex(id)));
        AirQualityIndexDto result = airQualityIndexMapper.entityToDto(createdAirQualityIndex);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(result);
    }

    @GetMapping
    public ResponseEntity<?> getAllMeasurementData(){
        List<AirQualityIndexDto> result = airQualityIndexService.findAll().stream().map(airQualityIndexMapper::entityToDto).collect(Collectors.toList());
        return ResponseEntity.ok()
                .body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMeasurementData(@PathVariable Long id){
        Optional<AirQualityIndexDto> result = airQualityIndexService.findById(id).map(airQualityIndexMapper::entityToDto);
        return ResponseUtil.wrapOrNotFound(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMeasurementData(@PathVariable Long id){
        airQualityIndexService.delete(id);
        return ResponseEntity
                .noContent()
                .headers(EntityAlertUtil.createEntityDeletionAlert(MeasurementData.class, id.toString()))
                .build();
    }


}
