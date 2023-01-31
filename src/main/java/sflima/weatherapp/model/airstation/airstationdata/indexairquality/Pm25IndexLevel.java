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
public class Pm25IndexLevel {
    private Integer pm25IdLevel;
    private String pm25IndexLevelName;
}
