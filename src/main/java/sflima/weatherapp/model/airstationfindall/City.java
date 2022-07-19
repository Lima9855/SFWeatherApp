
package sflima.weatherapp.model.airstationfindall;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "commune"
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class City {

    @JsonProperty("id")
    public Integer id_station;
    @JsonProperty("name")
    public String name;
    @Embedded
    @JsonProperty("commune")
    public Commune commune;

}
