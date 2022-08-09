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
public class Pm10IndexLevel {

    public Integer pm10_Id_Level;
    public String pm10_IndexLevelName;
}
