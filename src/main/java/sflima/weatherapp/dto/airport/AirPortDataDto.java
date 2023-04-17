package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class AirPortDataDto implements Serializable {
    private final BarometerDto barometer;
    private final CloudDto clouds;
    private final DewpointDto dewpoint;
    private final ElevationDto elevation;
    private final String flightCategory;
    private final HumidityDto humidity;
    private final String icao;
    private final String observed;
    private final String rawText;
    private final StationDto station;
    private final TemperatureDto temperature;
    private final VisibilityDto visibility;
    private final WindDto wind;

}
