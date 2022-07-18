package sflima.weatherapp.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sflima.weatherapp.api.Parse;
import sflima.weatherapp.model.AirPort;
import sflima.weatherapp.model.AirStation;
import sflima.weatherapp.model.airport.Datum;
import sflima.weatherapp.services.AirStationService;
import sflima.weatherapp.services.AirportService;
import sflima.weatherapp.services.CityService;
import sflima.weatherapp.services.CommuneService;
import sflima.weatherapp.services.apiservice.AirStationApiService;
import sflima.weatherapp.services.apiservice.AirportApiService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(DataLoader.class);

    private final AirportService airportService;
    private final AirStationService airStationService;
    private final CityService cityService;
    private final CommuneService communeService;
    private final AirportApiService airportApiService;
    private final AirStationApiService airStationApiService;

    public DataLoader(AirportService airportService, AirStationService airStationService, CityService cityService,
                      CommuneService communeService, AirportApiService airportApiService, AirStationApiService airStationApiService) {
        this.airportService = airportService;
        this.airStationService = airStationService;
        this.cityService = cityService;
        this.communeService = communeService;
        this.airportApiService = airportApiService;
        this.airStationApiService = airStationApiService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {

        Set<AirPort> airPorts = new HashSet<>();
        List<AirStation> airStations = new ArrayList<>();

        Parse parse = new Parse();
        try{
            //AirPort a1 = parse.parseAirportData("https://api.checkwx.com/metar/EPWR/decoded");
            AirPort a2 = parse.parseAirportData("https://api.checkwx.com/metar/EPWA/decoded");
            AirPort a3 = parse.parseAirportData("https://api.checkwx.com/metar/EPLL/decoded");
            AirPort a4 = parse.parseAirportData("https://api.checkwx.com/metar/EPGD/decoded");
            AirPort a5 = parse.parseAirportData("https://api.checkwx.com/metar/EDDB/decoded");
            AirPort a6 = parse.parseAirportData("https://api.checkwx.com/metar/EDDC/decoded");
            AirPort a7 = parse.parseAirportData("https://api.checkwx.com/metar/EDDP/decoded");

            airportService.save(a2);
            airportService.save(a3);
            airportService.save(a4);
            airportService.save(a5);
            airportService.save(a6);
            airportService.save(a7);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Datum d1 = airportApiService.getDatum("metar/EDDC/decoded");

        logger.info("lotnisko icao " + d1.getIcao());
        //resttemplate tez pokazuje ze obiekt Datum jest pusty, same nulle
        //Datum d1 = airportApiService.getData("https://api.checkwx.com/metar/EPWA/decoded");
        //airStations = airStationApiService.test();
    }
}
