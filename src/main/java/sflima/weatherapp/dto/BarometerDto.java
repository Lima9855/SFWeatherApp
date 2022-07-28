package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "hg",
        "hpa",
        "kpa",
        "mb"
})
@AllArgsConstructor
@Getter
public class BarometerDto implements Serializable {
    @JsonProperty("hg")
    private Float hg;
    @JsonProperty("hpa")
    private Float hpa;
    @JsonProperty("kpa")
    private Float kpa;
    @JsonProperty("mb")
    private Float mb;
}
