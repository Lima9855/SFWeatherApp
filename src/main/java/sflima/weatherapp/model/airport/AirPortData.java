
package sflima.weatherapp.model.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Data")
public class AirPortData{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Embedded
    private Barometer barometer;
    @Embedded
    private Cloud clouds; // tutaj zamiast listy to obiekt
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

    @ManyToOne
    private Airport airport;

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
