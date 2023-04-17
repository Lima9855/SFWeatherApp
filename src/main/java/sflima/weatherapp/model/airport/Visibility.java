
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
public class Visibility {

    private String metersVisibility;
    private Integer metersFloat;
    private String miles;
    private Float milesFloat;

}
