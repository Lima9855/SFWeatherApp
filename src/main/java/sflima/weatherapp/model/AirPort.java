package sflima.weatherapp.model;

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

    private String date;
    private String icao;
    private Integer humidity;
    private String name;
    private String location;
    private Integer temperature;
    private Integer wind;
    private Integer dewpoint;
    private Integer barometer;

    @Override
    public String toString()
    {
        return  this.icao + " " + this.name;
    }

}
