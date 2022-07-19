package sflima.weatherapp.bootstrap;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sflima.weatherapp.model.airport.AirPort;
import sflima.weatherapp.model.airstationfindall.AirStationAll;
import sflima.weatherapp.repository.AirPortRepository;
import sflima.weatherapp.repository.AirStationRepository;
import sflima.weatherapp.services.apiservice.AirStationApiService;
import sflima.weatherapp.services.apiservice.AirPortApiService;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(DataLoader.class);

    private final AirPortApiService airportApiService;
    private final AirStationApiService airStationApiService;
    private final AirStationRepository airStationRepository;
    private final AirPortRepository airPortRepository;

    public DataLoader(AirPortApiService airportApiService,
                      AirStationApiService airStationApiService, AirStationRepository airStationRepository, AirPortRepository airPortRepository) {
        this.airportApiService = airportApiService;
        this.airStationApiService = airStationApiService;
        this.airStationRepository = airStationRepository;
        this.airPortRepository = airPortRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {


        AirPort d1 = airportApiService.getAirport("metar/EDDC/decoded");
        logger.info("lotnisko icao " + d1.toString());

        airPortRepository.save(d1);

        List<AirStationAll> a1 = airStationApiService.getAirStaions();

        a1.forEach(o -> logger.info("Airstation " + o ));

        airStationRepository.saveAll(a1);

    }
}
