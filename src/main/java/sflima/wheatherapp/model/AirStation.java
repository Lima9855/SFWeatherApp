package sflima.wheatherapp.model;

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
public class AirStation extends BaseEntity{
    @Column(name = "stationId")
    private int stationId;
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
}
