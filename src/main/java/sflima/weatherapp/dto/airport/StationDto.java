package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class StationDto {
    private final GeometryDto geometry;
    private final String location;
    private final String name;
    private final String typeStation;

}
