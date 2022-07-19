
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

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
@Embeddable
public class Barometer  {

    @JsonProperty("hg")
    private Float hg;
    @JsonProperty("hpa")
    private Float hpa;
    @JsonProperty("kpa")
    private Float kpa;
    @JsonProperty("mb")
    private Float mb;

}
