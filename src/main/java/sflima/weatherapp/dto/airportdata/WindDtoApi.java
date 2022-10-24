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
        "degrees",
        "speed_kph",
        "speed_kts",
        "speed_mph",
        "speed_mps"
})

@Getter
@AllArgsConstructor
public class WindDtoApi {
    private final Integer degrees;
    @JsonProperty("speed_kph")
    private final Integer speedKph;
    @JsonProperty("speed_kts")
    private final Integer speedKts;
    @JsonProperty("speed_mph")
    private final Integer speedMph;
    @JsonProperty("speed_mps")
    private final Integer speedMps;
}
