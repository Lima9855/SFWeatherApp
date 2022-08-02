package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "barometer",
        "clouds",
        "dewpoint",
        "elevation",
        "flight_category",
        "humidity",
        "icao",
        "observed",
        "raw_text",
        "station",
        "temperature",
        "visibility",
        "wind"
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirPortDataDto implements Serializable {


    private  BarometerDto barometer;
    private  List<CloudDto> clouds = null;
    private  DewpointDto dewpoint;
    private  ElevationDto elevation;
    @JsonProperty("flight_category")
    private  String flightCategory;
    private  HumidityDto humidity;
    private  String icao;
    private  String observed;
    @JsonProperty("raw_text")
    private  String rawText;
    private  StationDto station;
    private  TemperatureDto temperature;
    private  VisibilityDto visibility;
    private  WindDto wind;

    public AirPortDataDto(BarometerDto barometer, DewpointDto dewpoint,
                          ElevationDto elevation, String flightCategory, HumidityDto humidity,
                          String icao, String observed, String rawText, StationDto station,
                          TemperatureDto temperature, VisibilityDto visibility, WindDto wind) {
        this.barometer = barometer;
        this.dewpoint = dewpoint;
        this.elevation = elevation;
        this.flightCategory = flightCategory;
        this.humidity = humidity;
        this.icao = icao;
        this.observed = observed;
        this.rawText = rawText;
        this.station = station;
        this.temperature = temperature;
        this.visibility = visibility;
        this.wind = wind;
    }

    @Override
    public String toString() {
        return "AirPortDataDto{" +
                "barometer=" + barometer +
                ", clouds=" + clouds +
                ", dewpoint=" + dewpoint +
                ", elevation=" + elevation +
                ", flightCategory='" + flightCategory + '\'' +
                ", humidity=" + humidity +
                ", icao='" + icao + '\'' +
                ", observed='" + observed + '\'' +
                ", rawText='" + rawText + '\'' +
                ", station=" + station +
                ", temperature=" + temperature +
                ", visibility=" + visibility +
                ", wind=" + wind +
                '}';
    }

}
