
package sflima.weatherapp.model.airstation.airstationall;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class City {

    public Integer id_station;
    public String name;
    @Embedded
    public Commune commune;

}
