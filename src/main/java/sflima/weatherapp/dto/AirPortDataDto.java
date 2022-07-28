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
public class AirPortDataDto implements Serializable {


    private final BarometerDto barometer;
    private final List<CloudDto> clouds = null;
    private final DewpointDto dewpoint;
    private final ElevationDto elevation;
    @JsonProperty("flight_category")
    private final String flightCategory;
    private final HumidityDto humidity;
    private final String icao;
    private final String observed;
    @JsonProperty("raw_text")
    private final String rawText;
    private final StationDto station;
    private final TemperatureDto temperature;
    private final VisibilityDto visibility;
    private final WindDto wind;
    private final GeometryDto geometry;

    public AirPortDataDto(BarometerDto barometer, DewpointDto dewpoint,
                          ElevationDto elevation, String flightCategory, HumidityDto humidity,
                          String icao, String observed, String rawText, StationDto station,
                          TemperatureDto temperature, VisibilityDto visibility, WindDto wind, GeometryDto geometry) {
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
        this.geometry = geometry;
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
                ", geometry=" + geometry +
                '}';
    }

}
