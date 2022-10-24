package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GeometryDto {
    private final Float coordinateX;
    private final Float coordinateY;
    private final String type;
}
