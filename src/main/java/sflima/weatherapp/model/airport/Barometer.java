
package sflima.weatherapp.model.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Barometer  {

    private Float hg;
    private Float hpa;
    private Float kpa;
    private Float mb;

}
