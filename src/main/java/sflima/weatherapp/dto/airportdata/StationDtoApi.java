package sflima.weatherapp.dto.airportdata;

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
        "geometry",
        "icao",
        "location",
        "name",
        "type"
})
@Getter
@AllArgsConstructor
public class StationDtoApi {

    private final GeometryDtoApi geometry;
    @JsonProperty("icao")
    private final String icaoStation;
    private final String location;
    private final String name;
    @JsonProperty("type")
    private final String typeStation;

    @Override
    public String toString() {
        return "StationDto{" +
                "geometry=" + geometry +
                ", icaoStation='" + icaoStation + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", typeStation='" + typeStation + '\'' +
                '}';
    }
}
