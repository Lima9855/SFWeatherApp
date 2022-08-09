
package sflima.weatherapp.model.airstation.airstationall;

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
public class Commune {

    public String communeName;
    public String districtName;
    public String provinceName;

}
