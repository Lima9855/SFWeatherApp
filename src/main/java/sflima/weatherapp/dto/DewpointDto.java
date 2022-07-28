package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class DewpointDto implements Serializable {
    private final Integer celsiusDewpoint;
    private final Integer fahrenheitDewpoint;
}
