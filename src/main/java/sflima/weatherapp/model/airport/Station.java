
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;


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
