package sflima.weatherapp.controllers;

import io.github.jhipster.web.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sflima.weatherapp.dto.airstation.airstationall.AirStationDto;
import sflima.weatherapp.mapper.AirStationMapper;
import sflima.weatherapp.model.airstation.airstationall.AirStation;
import sflima.weatherapp.services.airstationservices.AirStationService;
import sflima.weatherapp.services.apiservice.AirStationApiService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static sflima.weatherapp.utils.EntityAlertUtil.createEntityDeletionAlert;

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

    @PostMapping()
    public ResponseEntity<?> createListOfAirStations() {
        List<AirStationDto> airStaions = airStationApiService.getAirStations();
        for (AirStationDto dto : airStaions) {
            boolean flag = airStationService.existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(dto.getAddressStreet()
                    , dto.getStationIdentyficator(), dto.getStationName());
            AirStation entity = mapper.dtoToEntity(dto);
            airStationService.updateAirStation(entity, flag);
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(airStaions);
    }

    @GetMapping()
    public ResponseEntity<?> getAllAirStation() {
        List<AirStationDto> airStationDtos = airStationService.findAll().stream().map(mapper::entityToDto).collect(Collectors.toList());
        return ResponseEntity.ok().body(airStationDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAirStation(@PathVariable Long id) {
        Optional<AirStationDto> airStationDto = airStationService.findById(id).map(mapper::entityToDto);
        return ResponseUtil.wrapOrNotFound(airStationDto);
    }

    @GetMapping("/{cityName}")
    public ResponseEntity<?> getAirStationByCityName(@PathVariable String cityName) {
        List<AirStationDto> airStationDtos = airStationService.findAirStationByCityName(cityName).stream().map(mapper::entityToDto).collect(Collectors.toList());

        return ResponseEntity.ok()
                .body(airStationDtos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAirStation(@PathVariable Long id) {
        airStationService.delete(id);
        return ResponseEntity.noContent()
                .headers(createEntityDeletionAlert(AirStation.class, id.toString()))
                .build();
    }


}
