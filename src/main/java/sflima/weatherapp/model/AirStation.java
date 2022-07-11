package sflima.weatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "air_station")
public class AirStation  {
    @Id
    @Column(name = "stationId")
    private Long id;
    @Column(name = "stationName")
    private String stationName;
    @Column(name = "gegrLat")
    private double gegrLat;
    @Column(name = "gegrLon")
    private double gegrLon;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "airStation")
    @JoinColumn(name = "city")
    private City city;
    @Column(name = "addressStreet")
    private String addressStreet;

    @Override
    public String toString() {
        return "PowietrzeAll{" +
                "id=" + id +
                ", stationName='" + stationName + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                '}';
    }
}
