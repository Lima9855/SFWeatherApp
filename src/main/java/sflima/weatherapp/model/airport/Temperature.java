
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
public class Temperature {

    private Integer celsiusTemperature;
    private Integer fahrenheitTemperature;

}
