package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "celsius",
        "fahrenheit"
})

@AllArgsConstructor
@Getter
public class TemperatureDto implements Serializable {
    @JsonProperty("celsius")
    private final Integer celsiusTemperature;
    @JsonProperty("fahrenheit")
    private final Integer fahrenheitTemperature;
}
