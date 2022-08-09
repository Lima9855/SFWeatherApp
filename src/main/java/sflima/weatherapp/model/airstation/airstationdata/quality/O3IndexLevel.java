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
public class O3IndexLevel {

    public Integer O3_Id_Level;
    public String O3_IndexLevelName;
}
