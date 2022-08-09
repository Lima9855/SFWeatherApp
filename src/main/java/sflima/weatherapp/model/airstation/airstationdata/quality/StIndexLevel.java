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
public class StIndexLevel {

    public Integer st_Id_Level;
    public String st_IndexLevelName;
}
