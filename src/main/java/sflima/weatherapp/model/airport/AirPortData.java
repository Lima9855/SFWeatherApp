
package sflima.weatherapp.model.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Data")
public class AirPortData extends BaseEntity {

    @Embedded
    private Barometer barometer;
    //@Embedded
    //private Cloud clouds ; // to tez trzeba wyrzucic
    @Embedded
    private Dewpoint dewpoint;
    @Embedded
    private Elevation elevation;
    private String flightCategory;
    @Embedded
    private Humidity humidity;
    private String icao;
    private String observed;
    private String rawText;
    @Embedded
    private Station station; // w station geometry jest zle
    @Embedded
    private Temperature temperature;
    @Embedded
    private Visibility visibility;
    @Embedded
    private Wind wind;

    @Override
    public String toString() {
        return "Datum{" +
                ", barometer=" + barometer +
                ", clouds= "  +
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
