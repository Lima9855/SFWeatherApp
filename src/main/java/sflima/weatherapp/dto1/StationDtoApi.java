package sflima.weatherapp.dto1;

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
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StationDtoApi implements Serializable {

    private GeometryDtoApi geometry;
    @JsonProperty("icao")
    private String icaoStation;
    private  String location;
    private  String name;
    @JsonProperty("type")
    private  String typeStation;

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
