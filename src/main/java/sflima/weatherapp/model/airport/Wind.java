
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
public class Wind {

    private Integer degrees;
    private Integer speedKph;
    private Integer speedKts;
    private Integer speedMph;
    private Integer speedMps;

}
