
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coordinates",
    "type"
})
@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Geometry {

    private Float coordinateX; // zamiast List<Float> dajemy Stringa
    private Float coordinateY;
    private String type;


}
