
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
    "degrees",
    "speed_kph",
    "speed_kts",
    "speed_mph",
    "speed_mps"
})
@Generated("jsonschema2pojo")
public class Wind {

    @JsonProperty("degrees")
    private Integer degrees;
    @JsonProperty("speed_kph")
    private Integer speedKph;
    @JsonProperty("speed_kts")
    private Integer speedKts;
    @JsonProperty("speed_mph")
    private Integer speedMph;
    @JsonProperty("speed_mps")
    private Integer speedMps;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("degrees")
    public Integer getDegrees() {
        return degrees;
    }

    @JsonProperty("degrees")
    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
    }

    @JsonProperty("speed_kph")
    public Integer getSpeedKph() {
        return speedKph;
    }

    @JsonProperty("speed_kph")
    public void setSpeedKph(Integer speedKph) {
        this.speedKph = speedKph;
    }

    @JsonProperty("speed_kts")
    public Integer getSpeedKts() {
        return speedKts;
    }

    @JsonProperty("speed_kts")
    public void setSpeedKts(Integer speedKts) {
        this.speedKts = speedKts;
    }

    @JsonProperty("speed_mph")
    public Integer getSpeedMph() {
        return speedMph;
    }

    @JsonProperty("speed_mph")
    public void setSpeedMph(Integer speedMph) {
        this.speedMph = speedMph;
    }

    @JsonProperty("speed_mps")
    public Integer getSpeedMps() {
        return speedMps;
    }

    @JsonProperty("speed_mps")
    public void setSpeedMps(Integer speedMps) {
        this.speedMps = speedMps;
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
