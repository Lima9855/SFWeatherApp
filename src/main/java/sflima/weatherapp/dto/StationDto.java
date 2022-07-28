package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
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

@AllArgsConstructor
@Getter
public class StationDto implements Serializable {

    private GeometryDto geometry;
    @JsonProperty("icao")
    private String icaoStation;
    private final String location;
    private final String name;
    @JsonProperty("type")
    private final String typeStation;
}
