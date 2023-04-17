
package sflima.weatherapp.model.airstation.airstationall;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Embeddable;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Commune {

    private String communeName;
    private String districtName;
    private String provinceName;

}
