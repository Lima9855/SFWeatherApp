
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
    "hg",
    "hpa",
    "kpa",
    "mb"
})
@Generated("jsonschema2pojo")
public class Barometer {

    @JsonProperty("hg")
    private Double hg;
    @JsonProperty("hpa")
    private Double hpa;
    @JsonProperty("kpa")
    private Double kpa;
    @JsonProperty("mb")
    private Double mb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hg")
    public Double getHg() {
        return hg;
    }

    @JsonProperty("hg")
    public void setHg(Double hg) {
        this.hg = hg;
    }

    @JsonProperty("hpa")
    public Double getHpa() {
        return hpa;
    }

    @JsonProperty("hpa")
    public void setHpa(Double hpa) {
        this.hpa = hpa;
    }

    @JsonProperty("kpa")
    public Double getKpa() {
        return kpa;
    }

    @JsonProperty("kpa")
    public void setKpa(Double kpa) {
        this.kpa = kpa;
    }

    @JsonProperty("mb")
    public Double getMb() {
        return mb;
    }

    @JsonProperty("mb")
    public void setMb(Double mb) {
        this.mb = mb;
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
