
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Station {

    @Embedded
    private Geometry geometry;
    private String location;
    private String name;
    @JsonProperty("type")
    private String typeStation;

}
