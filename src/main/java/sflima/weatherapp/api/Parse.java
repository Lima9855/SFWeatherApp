package sflima.weatherapp.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import sflima.weatherapp.model.AirPort;
import sflima.weatherapp.model.AirStation;

import java.util.List;

public class Parse {
    public AirPort parseAirportData(String URL) /*throws JsonProcessingException*/ {
        try {
            Request request = Request.getRequest();
            JSONObject jsonObject = new JSONObject(request.sendGet(URL,"5b2a69d934bd4103968a69a4ee"));
            //System.out.println(jsonObject);
            JSONArray data1 = jsonObject.getJSONArray("data");
            JSONObject data2 = data1.getJSONObject(0);
            AirPort airport = new AirPort();
            airport.setDate(data2.getString("observed"));
            airport.setIcao(data2.getString("icao"));
            airport.setHumidity(data2.getJSONObject("humidity").getInt("percent"));
            airport.setName(data2.getJSONObject("station").getString("name"));
            airport.setLocation(data2.getJSONObject("station").getString("location"));
            airport.setTemperature(data2.getJSONObject("temperature").getInt("celsius"));
            airport.setWind(data2.getJSONObject("wind").getInt("speed_kph"));
            airport.setDewpoint(data2.getJSONObject("dewpoint").getInt("celsius"));
            airport.setBarometer(data2.getJSONObject("barometer").getInt("hpa"));
            System.out.println(airport);
            return airport;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public List<AirStation> parsePowietrzeAll(){
        try{
            Request request = new Request();
            ObjectMapper maper = Mapper.getObjectMapper();
            List<AirStation> powietrzeAllList = maper.readValue(request.sendGet("https://api.gios.gov.pl/pjp-api/rest/station/findAll")
                    , new TypeReference<List<AirStation>>(){});

            powietrzeAllList.stream().forEach(System.out::println);
            return powietrzeAllList;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
