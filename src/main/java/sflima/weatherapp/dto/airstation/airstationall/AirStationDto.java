package sflima.weatherapp.dto.airstation.airstationall;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "stationName",
        "gegrLat",
        "gegrLon",
        "city",
        "addressStreet"
})
@Getter
@AllArgsConstructor
public class AirStationDto {

    @JsonProperty("id")
    private final Integer stationIdentyficator;
    private final String stationName;
    private final String gegrLat;
    private final String gegrLon;
    private final CityDto city;
    private final String addressStreet;
}
