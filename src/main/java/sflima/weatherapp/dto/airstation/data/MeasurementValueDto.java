package sflima.weatherapp.dto.airstation.data;

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
@NoArgsConstructor
@Getter
@Setter
public class MeasurementValueDto implements Serializable {
    private String date;
    private Float value;
}
