
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
    "celsius",
    "fahrenheit"
})
@Generated("jsonschema2pojo")
public class Dewpoint {

    @JsonProperty("celsius")
    private Integer celsius;
    @JsonProperty("fahrenheit")
    private Integer fahrenheit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("celsius")
    public Integer getCelsius() {
        return celsius;
    }

    @JsonProperty("celsius")
    public void setCelsius(Integer celsius) {
        this.celsius = celsius;
    }

    @JsonProperty("fahrenheit")
    public Integer getFahrenheit() {
        return fahrenheit;
    }

    @JsonProperty("fahrenheit")
    public void setFahrenheit(Integer fahrenheit) {
        this.fahrenheit = fahrenheit;
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
