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
        "hg",
        "hpa",
        "kpa",
        "mb"
})
@Getter
@AllArgsConstructor
public class BarometerDtoApi {
    @JsonProperty("hg")
    private final Float hg;
    @JsonProperty("hpa")
    private final Float hpa;
    @JsonProperty("kpa")
    private final Float kpa;
    @JsonProperty("mb")
    private final Float mb;
}
