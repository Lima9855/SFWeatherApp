package sflima.weatherapp.dto.airstation.airstationdata.measurementdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "date",
        "value"
})

@AllArgsConstructor
@Getter
public class MeasurementValueDto {
    private final String date;
    private final Float value;
}
