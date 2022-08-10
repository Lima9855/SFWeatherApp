
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Dewpoint {

    @JsonProperty("celsius")
    private Integer celsiusDewpoint;
    @JsonProperty("fahrenheit")
    private Integer fahrenheitDewpoint;

}
