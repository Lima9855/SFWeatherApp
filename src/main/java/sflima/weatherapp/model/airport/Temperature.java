
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "celsius",
    "fahrenheit"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Temperature {

    @JsonProperty("celsius")
    private Integer celsiusTemperature;
    @JsonProperty("fahrenheit")
    private Integer fahrenheitTemperature;

}
