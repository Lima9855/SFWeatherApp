package sflima.weatherapp.dto2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class StationDto implements Serializable {
    private final GeometryDto geometry;
    private final String location;
    private final String name;
    private final String typeStation;

    @AllArgsConstructor
    @Getter
    public static class GeometryDto implements Serializable {
        private final Float coordinateX;
        private final Float coordinateY;
        private final String type;
    }
}
