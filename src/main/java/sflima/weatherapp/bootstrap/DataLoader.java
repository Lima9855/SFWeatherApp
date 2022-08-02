package sflima.weatherapp.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sflima.weatherapp.dto.AirPortDto;
import sflima.weatherapp.mapper.AirPortMapper;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.model.airstationfindall.AirStationAll;
import sflima.weatherapp.services.apiservice.AirPortApiService;
import sflima.weatherapp.services.apiservice.AirStationApiService;
import sflima.weatherapp.services.jpaservice.AirPortDataJpaService;
import sflima.weatherapp.services.jpaservice.AirPortJpaService;
import sflima.weatherapp.services.jpaservice.AirStationAllJpaService;

import java.util.List;

@Component
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
        loadData();
    }

    private void loadData() {


        AirPortDto d1 = airportApiService.getAirport("metar/EDDC/decoded"); // get request working  for dto objects, everything works
        AirPortDto d2 = airportApiService.getAirport("metar/EPLL/decoded");
        AirPortDto d3 = airportApiService.getAirport("metar/EPDG/decoded"); // null data, need to filter null somehow or not but dont store it if null
        AirPortDto d4 = airportApiService.getAirport("metar/EDDB/decoded");
        AirPortDto d5 = airportApiService.getAirport("metar/EDDC/decoded");
        AirPortDto d6 = airportApiService.getAirport("metar/EPWR/decoded");
        logger.info("lotnisko icao " + d1.toString());
        logger.info("lotnisko icao " + d2.toString());
        logger.info("lotnisko icao " + d3.toString());
        logger.info("lotnisko icao " + d4.toString());

        Airport airport1 = airPortMapper.dtoToEntity(d1);
        logger.info(" a1  " + airport1);
        airPortJpaService.saveAirPort(airport1);



        /*AirPortData data1 = airPortDataMapper.dtoToEntity(d1.getData().get(0));
        AirPortData data2 = airPortDataMapper.dtoToEntity(d2.getData().get(0));
        //AirPortData data3 = airPortDataMapper.dtoToEntity(d3.getData().get(0));
        AirPortData data4 = airPortDataMapper.dtoToEntity(d4.getData().get(0));
        AirPortData data5 = airPortDataMapper.dtoToEntity(d5.getData().get(0));
        AirPortData data6 = airPortDataMapper.dtoToEntity(d6.getData().get(0));
        logger.info("DATA FROM DTO " + data1);*/

        /*airPortDataJpaService.saveAirportData(data1);
        airPortDataJpaService.saveAirportData(data2);
        //airPortDataJpaService.saveAirportData(data3);
        airPortDataJpaService.saveAirportData(data4);
        airPortDataJpaService.saveAirportData(data5);
        airPortDataJpaService.saveAirportData(data6);*/


        List<AirStationAll> a1 = airStationApiService.getAirStaions();

        //a1.forEach(o -> logger.info("Airstation " + o ));

        airStationAllJpaService.saveAll(a1);

    }
}
