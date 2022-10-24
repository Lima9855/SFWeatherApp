package sflima.weatherapp.dto.airportdata;

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
@AllArgsConstructor
public class AirPortDataDtoApi {

    private BarometerDtoApi barometer;
    private final List<CloudDtoApi> clouds = null;
    private final DewpointDtoApi dewpoint;
    private final ElevationDtoApi elevation;
    @JsonProperty("flight_category")
    private final String flightCategory;
    private final HumidityDtoApi humidity;
    private final String icao;
    private final String observed;
    @JsonProperty("raw_text")
    private final String rawText;
    private final StationDtoApi station;
    private final TemperatureDtoApi temperature;
    private final VisibilityDtoApi visibility;
    private final WindDtoApi wind;

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
