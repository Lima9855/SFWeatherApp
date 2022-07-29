package sflima.weatherapp.dto;

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
        "celsius",
        "fahrenheit"
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TemperatureDto implements Serializable {
    @JsonProperty("celsius")
    private  Integer celsiusTemperature;
    @JsonProperty("fahrenheit")
    private  Integer fahrenheitTemperature;
}
