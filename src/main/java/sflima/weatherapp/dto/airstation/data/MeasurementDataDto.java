package sflima.weatherapp.dto.airstation.data;

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
@NoArgsConstructor
@Getter
@Setter
public class MeasurementDataDto implements Serializable {
    private String key;
    private List<MeasurementValueDto> values = null;
}
