package sflima.weatherapp.dto1;

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
public class AirPortDataDtoApi implements Serializable {


    private BarometerDtoApi barometer;
    private  List<CloudDtoApi> clouds = null;
    private DewpointDtoApi dewpoint;
    private ElevationDtoApi elevation;
    @JsonProperty("flight_category")
    private  String flightCategory;
    private HumidityDtoApi humidity;
    private  String icao;
    private  String observed;
    @JsonProperty("raw_text")
    private  String rawText;
    private StationDtoApi station;
    private TemperatureDtoApi temperature;
    private VisibilityDtoApi visibility;
    private WindDtoApi wind;

    public AirPortDataDtoApi(BarometerDtoApi barometer, DewpointDtoApi dewpoint,
                             ElevationDtoApi elevation, String flightCategory, HumidityDtoApi humidity,
                             String icao, String observed, String rawText, StationDtoApi station,
                             TemperatureDtoApi temperature, VisibilityDtoApi visibility, WindDtoApi wind) {
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
