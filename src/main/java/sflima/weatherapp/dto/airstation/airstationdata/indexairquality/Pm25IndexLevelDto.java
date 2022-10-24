package sflima.weatherapp.dto.airstation.airstationdata.indexairquality;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Pm25IndexLevelDto {
    private final Integer pm25_Id_Level;
    private final String pm25_IndexLevelName;
}
