
package sflima.weatherapp.model.airport;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "geometry",
    "icao",
    "location",
    "name",
    "type"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Station {

    @Embedded
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("icao")
    private String icaoStation;
    @JsonProperty("location")
    private String location;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String typeStation;

}
