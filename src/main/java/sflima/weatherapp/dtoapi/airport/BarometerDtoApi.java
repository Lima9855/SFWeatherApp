package sflima.weatherapp.dtoapi.airport;

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
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BarometerDtoApi implements Serializable {
    @JsonProperty("hg")
    private Float hg;
    @JsonProperty("hpa")
    private Float hpa;
    @JsonProperty("kpa")
    private Float kpa;
    @JsonProperty("mb")
    private Float mb;
}
