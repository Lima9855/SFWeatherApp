package sflima.weatherapp.controllers;

import io.github.jhipster.web.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sflima.weatherapp.dto.airport.AirPortDataDto;
import sflima.weatherapp.mapper.AirPortDataMapper;
import sflima.weatherapp.model.airport.AirPortData;
import sflima.weatherapp.services.airportservices.AirPortDataService;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

import static sflima.weatherapp.utils.EntityAlertUtil.*;

@RestController
@RequestMapping("/api/airport_data")
public class AirPortDataController {

    private final AirPortDataService airPortDataService;
    private final AirPortDataMapper mapper;

    public AirPortDataController(AirPortDataService airPortDataService, AirPortDataMapper mapper) {
        this.airPortDataService = airPortDataService;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirPortDataDto> getAirPortData(@PathVariable Long id) {
        Optional<AirPortDataDto> result = airPortDataService.findOne(id).map(mapper::entityToDto);
        return ResponseUtil.wrapOrNotFound(result);
    }

    @GetMapping()
    public ResponseEntity<List<AirPortDataDto>> getAllAirportData() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(mapper.entitiesToDtos(airPortDataService.getAirports()));
    }

    @GetMapping("/getByIcao")
    public ResponseEntity<List<AirPortDataDto>> getByIcao(String icao) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(mapper.entitiesToDtos(airPortDataService.getListOfAirPortDataByIcao(icao.toUpperCase(Locale.ROOT))));
    }

    @GetMapping("/getByStationName")
    public ResponseEntity<List<AirPortDataDto>> getByLocation(String name) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(mapper.entitiesToDtos(airPortDataService.getListOfAirPortDataByStationName(name)));
    }

    @GetMapping("/getByStationLocation")
    public ResponseEntity<List<AirPortDataDto>> getByStationLocation(String location) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(mapper.entitiesToDtos(airPortDataService.getListOfAirPortDataByLocation(location)));
    }

    @GetMapping("/getByObservationDate")
    public ResponseEntity<List<AirPortDataDto>> getByObservationDate(String date) {
        return ResponseEntity.status(HttpStatus.OK)
                .body((mapper.entitiesToDtos(airPortDataService.getListOfAirPortDataByObserved(date))));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAirPortData(@PathVariable Long id) {
        airPortDataService.deleteById(id);
        return ResponseEntity.noContent()
                .headers(createEntityDeletionAlert(AirPortData.class, id.toString())).build();
    }
}
