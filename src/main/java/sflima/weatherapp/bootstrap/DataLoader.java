package sflima.weatherapp.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sflima.weatherapp.dto.AirPortDto;
import sflima.weatherapp.mapper.AirPortDataMapper;
import sflima.weatherapp.repository.AirPortDataRepository;
import sflima.weatherapp.repository.AirStationRepository;
import sflima.weatherapp.services.apiservice.AirStationApiService;
import sflima.weatherapp.services.apiservice.AirPortApiService;

@Component
public class DataLoader implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(DataLoader.class);
    private final AirPortDataMapper mapper;

    private final AirPortApiService airportApiService;
    private final AirStationApiService airStationApiService;
    private final AirStationRepository airStationRepository;
    private final AirPortDataRepository airPortDataRepository;

    public DataLoader(AirPortDataMapper mapper,
                      AirPortApiService airportApiService,
                      AirStationApiService airStationApiService,
                      AirStationRepository airStationRepository,
                      AirPortDataRepository airPortDataRepository) {
        this.airportApiService = airportApiService;
        this.mapper = mapper;
        this.airStationApiService = airStationApiService;
        this.airStationRepository = airStationRepository;
        this.airPortDataRepository = airPortDataRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {



        AirPortDto d1 = airportApiService.getAirport("metar/EDDC/decoded"); // get request working  for dto objects, everything works
        AirPortDto d2 = airportApiService.getAirport("metar/EPLL/decoded");
        AirPortDto d3 = airportApiService.getAirport("metar/EPDG/decoded"); // null data, need to filter null somehow
        AirPortDto d4 = airportApiService.getAirport("metar/EDDB/decoded");
        AirPortDto d5 = airportApiService.getAirport("metar/EDDC/decoded");
        AirPortDto d6 = airportApiService.getAirport("metar/EPWR/decoded");
        //logger.info("lotnisko icao " + d1.toString());
        logger.info("lotnisko icao " + d2.toString());
        logger.info("lotnisko icao " + d3.toString());
        logger.info("lotnisko icao " + d4.toString());

        //AirPortData data1 = mapper.dtoToEntity(d1.getData().get(0));

        //logger.info("DATA FROM DTO " + data1);
        //airPortDataRepository.save(d1.getData().get(0)); //hard coded get(0) json from response always returns List of one object
        //airPortDataRepository.save(d3.getData().get(0)); i need a condition that will stop a save() if response doesnt contain any data
        // after refactoring and adding dto classes i need a service that will map my dto object to model object then i can
        // saved mapped object to a database via repository
        /*List<AirStationAll> a1 = airStationApiService.getAirStaions();

        a1.forEach(o -> logger.info("Airstation " + o ));

        airStationRepository.saveAll(a1);*/

    }
}
