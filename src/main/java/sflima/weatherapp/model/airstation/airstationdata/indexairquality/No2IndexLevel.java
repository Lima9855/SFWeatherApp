package sflima.weatherapp.model.airstation.airstationdata.indexairquality;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class No2IndexLevel {
    private Integer no2_Id_Level;
    private String no2_IndexLevelName;
}
