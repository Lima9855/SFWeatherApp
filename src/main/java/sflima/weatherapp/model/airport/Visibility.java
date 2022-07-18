
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
    "meters",
    "meters_float",
    "miles",
    "miles_float"
})
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Visibility {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty("meters")
    private String meters;
    @JsonProperty("meters_float")
    private Integer metersFloat;
    @JsonProperty("miles")
    private String miles;
    @JsonProperty("miles_float")
    private Float milesFloat;

}
