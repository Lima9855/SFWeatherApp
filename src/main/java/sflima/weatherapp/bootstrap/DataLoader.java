package sflima.weatherapp.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sflima.weatherapp.dto1.AirPortDtoApi;
import sflima.weatherapp.mapper.AirPortMapper;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.model.airstationfindall.AirStationAll;
import sflima.weatherapp.services.apiservice.AirPortApiService;
import sflima.weatherapp.services.apiservice.AirStationApiService;
import sflima.weatherapp.services.jpaservice.AirPortJpaService;
import sflima.weatherapp.services.jpaservice.AirStationAllJpaService;

import java.util.List;

//@Component
public class DataLoader implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(DataLoader.class);

    private final AirPortApiService airportApiService;
    private final AirStationApiService airStationApiService;
    //private final AirPortDataJpaService airPortDataJpaService;
    private final AirStationAllJpaService airStationAllJpaService;
    private final AirPortMapper airPortMapper;
    private final AirPortJpaService airPortJpaService;

    public DataLoader(AirPortApiService airportApiService, AirStationApiService airStationApiService
            , AirStationAllJpaService airStationAllJpaService, AirPortMapper airPortMapper, AirPortJpaService airPortJpaService) {
        this.airportApiService = airportApiService;
        this.airStationApiService = airStationApiService;
        this.airStationAllJpaService = airStationAllJpaService;
        this.airPortMapper = airPortMapper;
        this.airPortJpaService = airPortJpaService;
    }

    @Override
    public void run(String... args) throws Exception {
        //loadData();
    }

    private void loadData() {


        AirPortDtoApi d1 = airportApiService.getAirport("EDDC/decoded");
        AirPortDtoApi d2 = airportApiService.getAirport("EPLL/decoded");
        AirPortDtoApi d3 = airportApiService.getAirport("EPDG/decoded");
        AirPortDtoApi d4 = airportApiService.getAirport("EDDB/decoded");
        AirPortDtoApi d5 = airportApiService.getAirport("EDDC/decoded");
        AirPortDtoApi d6 = airportApiService.getAirport("EPWR/decoded");
        logger.info("lotnisko icao " + d1.toString());
        logger.info("lotnisko icao " + d2.toString());
        logger.info("lotnisko icao " + d3.toString());
        logger.info("lotnisko icao " + d4.toString());

        Airport airport1 = airPortMapper.dtoToEntity(d1);
        logger.info(" a1  " + airport1);
        airPortJpaService.saveAirPort(airport1);
        Airport airport2 = airPortMapper.dtoToEntity(d2);
        logger.info(" a2  " + airport2);
        airPortJpaService.saveAirPort(airport2);
        Airport airport3 = airPortMapper.dtoToEntity(d3);
        logger.info(" a3  " + airport3);
        airPortJpaService.saveAirPort(airport3);
        Airport airport4 = airPortMapper.dtoToEntity(d4);
        logger.info(" a4  " + airport4);
        airPortJpaService.saveAirPort(airport4);
        Airport airport5 = airPortMapper.dtoToEntity(d5);
        logger.info(" a5  " + airport5);
        airPortJpaService.saveAirPort(airport5);
        Airport airport6 = airPortMapper.dtoToEntity(d6);
        logger.info(" a6  " + airport6);
        airPortJpaService.saveAirPort(airport6);



        List<AirStationAll> a1 = airStationApiService.getAirStaions();

        //a1.forEach(o -> logger.info("Airstation " + o ));

        airStationAllJpaService.saveAll(a1);

    }
}
