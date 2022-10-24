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
        "meters",
        "meters_float",
        "miles",
        "miles_float"
})

@Getter
@AllArgsConstructor
public class VisibilityDtoApi {
    @JsonProperty("meters")
    private final String metersVisibility;
    @JsonProperty("meters_float")
    private final Integer metersFloat;
    private final String miles;
    @JsonProperty("miles_float")
    private final Float milesFloat;
}
