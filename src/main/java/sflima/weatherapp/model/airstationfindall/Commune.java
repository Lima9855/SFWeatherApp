
package sflima.weatherapp.model.airstationfindall;

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

    public String communeName;
    public String districtName;
    public String provinceName;

}
