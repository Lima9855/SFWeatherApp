package sflima.weatherapp.model.airstation.airstationdata.indexairquality;

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
public class Pm25IndexLevel {
    private Integer pm25_Id_Level;
    private String pm25_IndexLevelName;
}
