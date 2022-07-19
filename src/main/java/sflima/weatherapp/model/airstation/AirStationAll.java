
package sflima.weatherapp.model.airstation;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "stationName",
    "gegrLat",
    "gegrLon",
    "city",
    "addressStreet"
})
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirStationAll extends BaseEntity {

    @JsonProperty("id")
    public Integer stationIdentyficator;
    @JsonProperty("stationName")
    public String stationName;
    @JsonProperty("gegrLat")
    public String gegrLat;
    @JsonProperty("gegrLon")
    public String gegrLon;
    @Embedded
    @JsonProperty("city")
    public City city;
    @JsonProperty("addressStreet")
    public String addressStreet;

}
