package sflima.weatherapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sflima.weatherapp.Api.Parse;
import sflima.weatherapp.model.AirPort;
import sflima.weatherapp.model.AirStation;
import sflima.weatherapp.services.AirStationService;
import sflima.weatherapp.services.AirportService;
import sflima.weatherapp.services.CityService;
import sflima.weatherapp.services.CommuneService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class DataLoader  {

   /* private final AirportService airportService;
    private final AirStationService airStationService;
    private final CityService cityService;
    private final CommuneService communeService;


    public DataLoader(AirportService airportService, AirStationService airStationService, CityService cityService, CommuneService communeService) {
        this.airportService = airportService;
        this.airStationService = airStationService;
        this.cityService = cityService;
        this.communeService = communeService;
    }*/ //problem z DI nie widzi bean serwisu



    private void loadData() {

        Set<AirPort> airPorts = new HashSet<>();
        List<AirStation> airStations = new ArrayList<>();

        Parse parse = new Parse();
        try{
            AirPort a1 = parse.parseAirportData("https://api.checkwx.com/metar/EPWR/decoded");
            AirPort a2 = parse.parseAirportData("https://api.checkwx.com/metar/EPWA/decoded");
            AirPort a3 = parse.parseAirportData("https://api.checkwx.com/metar/EPLL/decoded");
            AirPort a4 = parse.parseAirportData("https://api.checkwx.com/metar/EPGD/decoded");
            AirPort a5 = parse.parseAirportData("https://api.checkwx.com/metar/EDDB/decoded");
            AirPort a6 = parse.parseAirportData("https://api.checkwx.com/metar/EDDC/decoded");
            AirPort a7 = parse.parseAirportData("https://api.checkwx.com/metar/EDDP/decoded");
            airStations = parse.parsePowietrzeAll();
            /*airportService.save(a1);
            airportService.save(a2);
            airportService.save(a3);
            airportService.save(a4);
            airportService.save(a5);
            airportService.save(a6);
            airportService.save(a7);*/
            //airStationService.saveAll(airStations);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
