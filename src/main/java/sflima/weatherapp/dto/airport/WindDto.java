package sflima.weatherapp.dto.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class WindDto implements Serializable {
    private final Integer degrees;
    private final Integer speedKph;
    private final Integer speedKts;
    private final Integer speedMph;
    private final Integer speedMps;
}
