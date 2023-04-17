
package sflima.weatherapp.model.airstation.airstationall;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class City {

    private Integer id_station;
    private String name;
    @Embedded
    private Commune commune;

}
