package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class DewpointDto implements Serializable {
    private final Integer celsiusDewpoint;
    private final Integer fahrenheitDewpoint;
}
