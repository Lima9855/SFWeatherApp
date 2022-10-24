package sflima.weatherapp.dto.airstation.airstationdata.measurementstation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "stationId",
        "param"
})

@AllArgsConstructor
@Getter
public class MeasurementStationDto {
    @JsonProperty("id")
    private final Integer measurement_data_id;
    private final Integer stationId;
    private final ParamDto param;
}
