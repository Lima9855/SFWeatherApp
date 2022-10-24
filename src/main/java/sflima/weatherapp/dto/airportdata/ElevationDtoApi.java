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
        "feet",
        "meters"
})

@Getter
@AllArgsConstructor
public class ElevationDtoApi {
    private final  Integer feet;
    @JsonProperty("meters")
    private final Integer metersElevation;
}
