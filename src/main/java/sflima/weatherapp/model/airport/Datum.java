
package sflima.weatherapp.model.airport;

import java.util.List;
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
public class Datum {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Airport airport;
    @Embedded
    @JsonProperty("barometer")
    private Barometer barometer;
    @Embedded
    @JsonProperty("clouds")
    private Cloud clouds = null;
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

}
