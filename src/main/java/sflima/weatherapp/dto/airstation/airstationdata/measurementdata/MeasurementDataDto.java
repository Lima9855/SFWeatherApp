package sflima.weatherapp.dto.airstation.airstationdata.measurementdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "key",
        "values"
})

@AllArgsConstructor
@Getter
public class MeasurementDataDto implements Serializable {
    private final String key;
    private final List<MeasurementValueDto> values = null;
}
