package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class BarometerDto implements Serializable {
    private final Float hg;
    private final Float hpa;
    private final Float kpa;
    private final Float mb;
}
