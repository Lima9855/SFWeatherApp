package sflima.weatherapp.model.airstation.airstationdata.measurementstation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Param  {

    private String paramName;
    private String paramFormula;
    private String paramCode;
    private Integer idParam;
}
