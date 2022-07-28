package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "coordinates",
        "type"
})
@AllArgsConstructor
@Getter
public class GeometryDto implements Serializable {

    @JsonProperty("coordinates")
    private final List<Float> coordinates;
    private final String type;
}
