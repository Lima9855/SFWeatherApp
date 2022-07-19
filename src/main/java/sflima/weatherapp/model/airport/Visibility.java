
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
    "meters",
    "meters_float",
    "miles",
    "miles_float"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Visibility {

    @JsonProperty("meters")
    private String metersVisibility;
    @JsonProperty("meters_float")
    private Integer metersFloat;
    @JsonProperty("miles")
    private String miles;
    @JsonProperty("miles_float")
    private Float milesFloat;

}
