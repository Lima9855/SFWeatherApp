package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class VisibilityDto {
    private final String metersVisibility;
    private final Integer metersFloat;
    private final String miles;
    private final Float milesFloat;
}
