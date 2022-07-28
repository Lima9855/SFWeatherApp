
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Station {

    @Embedded
    private Geometry geometry;
    @Transient
    @JsonProperty("icao")
    private String icaoStation;
    private String location;
    private String name;
    @JsonProperty("type")
    private String typeStation;
    /*@JsonIgnore
    private String coordinatesGeo = geometry.getCoordinates().toString();
    @JsonIgnore
    private String typeGeo = geometry.getType();*/ // add this to model after refactoring model classes to RestApiDTO


}
