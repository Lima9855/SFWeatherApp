
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
    "meters",
    "meters_float",
    "miles",
    "miles_float"
})
@Generated("jsonschema2pojo")
public class Visibility {

    @JsonProperty("meters")
    private String meters;
    @JsonProperty("meters_float")
    private Integer metersFloat;
    @JsonProperty("miles")
    private String miles;
    @JsonProperty("miles_float")
    private Double milesFloat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("meters")
    public String getMeters() {
        return meters;
    }

    @JsonProperty("meters")
    public void setMeters(String meters) {
        this.meters = meters;
    }

    @JsonProperty("meters_float")
    public Integer getMetersFloat() {
        return metersFloat;
    }

    @JsonProperty("meters_float")
    public void setMetersFloat(Integer metersFloat) {
        this.metersFloat = metersFloat;
    }

    @JsonProperty("miles")
    public String getMiles() {
        return miles;
    }

    @JsonProperty("miles")
    public void setMiles(String miles) {
        this.miles = miles;
    }

    @JsonProperty("miles_float")
    public Double getMilesFloat() {
        return milesFloat;
    }

    @JsonProperty("miles_float")
    public void setMilesFloat(Double milesFloat) {
        this.milesFloat = milesFloat;
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
