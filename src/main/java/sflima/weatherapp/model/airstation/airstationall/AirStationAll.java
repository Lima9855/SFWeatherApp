
package sflima.weatherapp.model.airstation.airstationall;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirStationAll extends BaseEntity {

    public Integer stationIdentyficator;
    public String stationName;
    public String gegrLat;
    public String gegrLon;
    @Embedded
    public City city;
    public String addressStreet;

    @Override
    public String toString() {
        return "AirStationAll{" +
                "stationIdentyficator=" + stationIdentyficator +
                ", stationName='" + stationName + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                '}';
    }
}
