package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class TemperatureDto implements Serializable {
    private final Integer celsiusTemperature;
    private final Integer fahrenheitTemperature;
}
