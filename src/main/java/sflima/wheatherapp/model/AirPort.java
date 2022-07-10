package sflima.wheatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "airport")
public class AirPort extends BaseEntity {
    @Column(name = "date")
    private String date;
    @Column(name = "icao")
    private String icao;
    @Column(name = "humidity")
    private Integer humidity;
    @Column(name = "name")
    private String name;
    @Column(name = "locationo")
    private String location;
    @Column(name = "temperature")
    private Integer temperature;
    @Column(name = "wind")
    private Integer wind;
    @Column(name = "dewpoint")
    private Integer dewpoint;
    @Column(name = "barometer")
    private Integer barometer;

}
