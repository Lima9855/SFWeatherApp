package sflima.weatherapp.dto2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class ElevationDto implements Serializable {
    private final Integer feet;
    private final Integer metersElevation;
}
