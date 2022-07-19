
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Datum extends BaseEntity {

    @ManyToOne
    @JoinColumn
    private AirPort airport;
    @Embedded
    @JsonProperty("barometer")
    private Barometer barometer;
    @Embedded
    @JsonProperty("clouds")
    @JsonIgnore
    private Cloud clouds ;
    @Embedded
    @JsonProperty("dewpoint")
    private Dewpoint dewpoint;
    @Embedded
    @JsonProperty("elevation")
    private Elevation elevation;
    @JsonProperty("flight_category")
    private String flightCategory;
    @Embedded
    @JsonProperty("humidity")
    private Humidity humidity;
    @JsonProperty("icao")
    private String icao;
    @JsonProperty("observed")
    private String observed;
    @JsonProperty("raw_text")
    private String rawText;
    @Embedded
    @JsonProperty("station")
    private Station station;
    @Embedded
    @JsonProperty("temperature")
    private Temperature temperature;
    @Embedded
    @JsonProperty("visibility")
    private Visibility visibility;
    @Embedded
    @JsonProperty("wind")
    private Wind wind;

    @Override
    public String toString() {
        return "Datum{" +
                ", barometer=" + barometer +
                ", clouds= ignored via @JsonIgnore"  +
                ", dewpoint=" + dewpoint +
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
