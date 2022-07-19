
package sflima.weatherapp.model.airstation;

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
    "communeName",
    "districtName",
    "provinceName"
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Commune {

    @JsonProperty("communeName")
    public String communeName;
    @JsonProperty("districtName")
    public String districtName;
    @JsonProperty("provinceName")
    public String provinceName;

}
