package sflima.weatherapp.dto2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class VisibilityDto implements Serializable {
    private final String metersVisibility;
    private final Integer metersFloat;
    private final String miles;
    private final Float milesFloat;
}
