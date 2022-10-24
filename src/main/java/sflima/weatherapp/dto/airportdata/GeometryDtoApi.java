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
        "coordinates",
        "type"
})
@Getter
@AllArgsConstructor
public class GeometryDtoApi {

    @JsonProperty("coordinates")
    private final List<Float> coordinates;
    private final String type;


    @Override
    public String toString() {
        return "GeometryDto{" +
                "coordinates=" + coordinates +
                ", type='" + type + '\'' +
                '}';
    }
}
