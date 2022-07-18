
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "celsius",
    "fahrenheit"
})
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Dewpoint {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty("celsius")
    private Integer celsius;
    @JsonProperty("fahrenheit")
    private Integer fahrenheit;

}
