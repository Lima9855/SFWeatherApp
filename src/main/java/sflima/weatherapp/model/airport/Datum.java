
package sflima.weatherapp.model.airport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "barometer",
    "clouds",
    "dewpoint",
    "elevation",
    "flight_category",
    "humidity",
    "icao",
    "observed",
    "raw_text",
    "station",
    "temperature",
    "visibility",
    "wind"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("barometer")
    private Barometer barometer;
    @JsonProperty("clouds")
    private List<Cloud> clouds = null;
    @JsonProperty("dewpoint")
    private Dewpoint dewpoint;
    @JsonProperty("elevation")
    private Elevation elevation;
    @JsonProperty("flight_category")
    private String flightCategory;
    @JsonProperty("humidity")
    private Humidity humidity;
    @JsonProperty("icao")
    private String icao;
    @JsonProperty("observed")
    private String observed;
    @JsonProperty("raw_text")
    private String rawText;
    @JsonProperty("station")
    private Station station;
    @JsonProperty("temperature")
    private Temperature temperature;
    @JsonProperty("visibility")
    private Visibility visibility;
    @JsonProperty("wind")
    private Wind wind;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("barometer")
    public Barometer getBarometer() {
        return barometer;
    }

    @JsonProperty("barometer")
    public void setBarometer(Barometer barometer) {
        this.barometer = barometer;
    }

    @JsonProperty("clouds")
    public List<Cloud> getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(List<Cloud> clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("dewpoint")
    public Dewpoint getDewpoint() {
        return dewpoint;
    }

    @JsonProperty("dewpoint")
    public void setDewpoint(Dewpoint dewpoint) {
        this.dewpoint = dewpoint;
    }

    @JsonProperty("elevation")
    public Elevation getElevation() {
        return elevation;
    }

    @JsonProperty("elevation")
    public void setElevation(Elevation elevation) {
        this.elevation = elevation;
    }

    @JsonProperty("flight_category")
    public String getFlightCategory() {
        return flightCategory;
    }

    @JsonProperty("flight_category")
    public void setFlightCategory(String flightCategory) {
        this.flightCategory = flightCategory;
    }

    @JsonProperty("humidity")
    public Humidity getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("icao")
    public String getIcao() {
        return icao;
    }

    @JsonProperty("icao")
    public void setIcao(String icao) {
        this.icao = icao;
    }

    @JsonProperty("observed")
    public String getObserved() {
        return observed;
    }

    @JsonProperty("observed")
    public void setObserved(String observed) {
        this.observed = observed;
    }

    @JsonProperty("raw_text")
    public String getRawText() {
        return rawText;
    }

    @JsonProperty("raw_text")
    public void setRawText(String rawText) {
        this.rawText = rawText;
    }

    @JsonProperty("station")
    public Station getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(Station station) {
        this.station = station;
    }

    @JsonProperty("temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("visibility")
    public Visibility getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Datum{" +
                "dewpoint=" + dewpoint +
                ", elevation=" + elevation +
                ", flightCategory='" + flightCategory + '\'' +
                ", humidity=" + humidity +
                ", icao='" + icao + '\'' +
                ", observed='" + observed + '\'' +
                ", rawText='" + rawText + '\'' +
                ", station=" + station +
                ", temperature=" + temperature +
                ", visibility=" + visibility +
                ", wind=" + wind +
                '}';
    }
}
