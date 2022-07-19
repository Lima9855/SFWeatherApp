
package sflima.weatherapp.model.airport;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import sflima.weatherapp.model.BaseEntity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "degrees",
    "speed_kph",
    "speed_kts",
    "speed_mph",
    "speed_mps"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Wind {

    @JsonProperty("degrees")
    private Integer degrees;
    @JsonProperty("speed_kph")
    private Integer speedKph;
    @JsonProperty("speed_kts")
    private Integer speedKts;
    @JsonProperty("speed_mph")
    private Integer speedMph;
    @JsonProperty("speed_mps")
    private Integer speedMps;

}
