package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class ElevationDto implements Serializable {
    private final Integer feet;
    private final Integer metersElevation;
}
