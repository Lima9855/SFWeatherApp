
package sflima.weatherapp.model.airstation.airstationall;

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
public class AirStation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;
    private Integer stationIdentyficator;
    private String stationName;
    private String gegrLat;
    private String gegrLon;
    @Embedded
    private City city;
    private String addressStreet;

    @Override
    public String toString() {
        return "AirStationAll{" +
                "stationIdentyficator=" + stationIdentyficator +
                ", stationName='" + stationName + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                '}';
    }
}
