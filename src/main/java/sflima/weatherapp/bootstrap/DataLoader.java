package sflima.weatherapp.bootstrap;

import org.springframework.stereotype.Component;
import sflima.weatherapp.Api.Parse;
import sflima.weatherapp.services.AirStationService;
import sflima.weatherapp.services.AirportService;
import sflima.weatherapp.services.CityService;
import sflima.weatherapp.services.CommuneService;

@Component
public class DataLoader {

    private final AirportService airportService;
    private final AirStationService airStationService;
    private final CityService cityService;
    private final CommuneService communeService;


    public DataLoader(AirportService airportService, AirStationService airStationService, CityService cityService, CommuneService communeService) {
        this.airportService = airportService;
        this.airStationService = airStationService;
        this.cityService = cityService;
        this.communeService = communeService;
    }

    private void loadData(){
        Parse parse = new Parse();
        try{
            parse.parseAirportData("https://api.checkwx.com/metar/EPWR/decoded");
            parse.parseAirportData("https://api.checkwx.com/metar/EPWA/decoded");
            parse.parseAirportData("https://api.checkwx.com/metar/EPLL/decoded");
            parse.parseAirportData("https://api.checkwx.com/metar/EPGD/decoded");
            parse.parseAirportData("https://api.checkwx.com/metar/EDDB/decoded");
            parse.parseAirportData("https://api.checkwx.com/metar/EDDC/decoded");
            parse.parseAirportData("https://api.checkwx.com/metar/EDDP/decoded");
            parse.parsePowietrzeAll();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
