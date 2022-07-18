
package sflima.weatherapp.model.airport;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "feet",
    "meters"
})
@Generated("jsonschema2pojo")
public class Elevation {

    @JsonProperty("feet")
    private Integer feet;
    @JsonProperty("meters")
    private Integer meters;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("feet")
    public Integer getFeet() {
        return feet;
    }

    @JsonProperty("feet")
    public void setFeet(Integer feet) {
        this.feet = feet;
    }

    @JsonProperty("meters")
    public Integer getMeters() {
        return meters;
    }

    @JsonProperty("meters")
    public void setMeters(Integer meters) {
        this.meters = meters;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
