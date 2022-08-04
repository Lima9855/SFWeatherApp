package sflima.weatherapp.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import sflima.weatherapp.dto.AirPortDto;
import sflima.weatherapp.mapper.AirPortMapper;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.services.apiservice.AirPortApiService;
import sflima.weatherapp.services.jpaservice.AirPortJpaService;

@RestController
public class AirPortController {

    private AirPortApiService airPortApiService;
    private AirPortJpaService airPortJpaService;
    private AirPortMapper airPortMapper;

    public AirPortController(AirPortApiService airPortApiService, AirPortJpaService airPortJpaService, AirPortMapper airPortMapper) {
        this.airPortApiService = airPortApiService;
        this.airPortJpaService = airPortJpaService;
        this.airPortMapper = airPortMapper;
    }

    @PutMapping("/putAirport")
    public Airport createAirport (String uri){
        AirPortDto airPortDto = airPortApiService.getAirport(uri);
        Airport airport = airPortMapper.dtoToEntity(airPortDto);

        return airPortJpaService.saveAirPort(airport);
    }
}
