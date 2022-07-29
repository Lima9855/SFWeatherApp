package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.airport.Geometry;

import java.io.Serializable;

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
public class StationDto implements Serializable {

    private GeometryDto geometry;
    @JsonProperty("icao")
    private String icaoStation;
    private  String location;
    private  String name;
    @JsonProperty("type")
    private  String typeStation;
}
