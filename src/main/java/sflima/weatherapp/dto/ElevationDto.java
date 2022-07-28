package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "feet",
        "meters"
})

@AllArgsConstructor
@Getter
public class ElevationDto implements Serializable {
    private final Integer feet;
    @JsonProperty("meters")
    private final Integer metersElevation;
}
