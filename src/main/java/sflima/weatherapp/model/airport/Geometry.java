
package sflima.weatherapp.model.airport;

import java.util.List;
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
    "coordinates",
    "type"
})
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Geometry {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty("coordinates")
    private List<Float> coordinates = null;
    @JsonProperty("type")
    private String type;

}
