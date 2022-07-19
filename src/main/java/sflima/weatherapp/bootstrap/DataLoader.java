package sflima.weatherapp.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.services.apiservice.AirportApiService;

@Component
public class DataLoader implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(DataLoader.class);


    private final AirportApiService airportApiService;

    public DataLoader(AirportApiService airportApiService) {
        this.airportApiService = airportApiService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {


        Airport d1 = airportApiService.getAirport("metar/EDDC/decoded");
        logger.info("lotnisko icao " + d1.toString());
        //resttemplate tez pokazuje ze obiekt Datum jest pusty, same nulle
        //Datum d1 = airportApiService.getData("https://api.checkwx.com/metar/EPWA/decoded");
        //airStations = airStationApiService.test();
    }
}
