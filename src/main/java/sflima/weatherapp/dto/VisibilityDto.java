package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "meters",
        "meters_float",
        "miles",
        "miles_float"
})

@AllArgsConstructor
@Getter
public class VisibilityDto implements Serializable {
    @JsonProperty("meters")
    private final String metersVisibility;
    @JsonProperty("meters_float")
    private final Integer metersFloat;
    private final String miles;
    @JsonProperty("miles_float")
    private final Float milesFloat;
}
