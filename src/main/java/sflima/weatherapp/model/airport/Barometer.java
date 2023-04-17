
package sflima.weatherapp.model.airport;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
