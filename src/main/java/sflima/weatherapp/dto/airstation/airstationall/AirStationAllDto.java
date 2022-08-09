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
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirStationAllDto implements Serializable {

    @JsonProperty("id")
    private  Integer stationIdentyficator;
    private  String stationName;
    private  String gegrLat;
    private  String gegrLon;
    private  CityDto city;
    private  String addressStreet;
}
