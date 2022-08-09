package sflima.weatherapp.model.airstation.airstationdata.quality;

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
public class So2IndexLevel {

    public Integer so2_Id_Level;
    public String so2_IndexLevelName;
}