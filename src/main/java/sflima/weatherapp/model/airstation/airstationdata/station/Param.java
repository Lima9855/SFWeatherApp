package sflima.weatherapp.model.airstation.airstationdata.station;

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

    public String paramName;
    public String paramFormula;
    public String paramCode;
    public Integer idParam;
}
