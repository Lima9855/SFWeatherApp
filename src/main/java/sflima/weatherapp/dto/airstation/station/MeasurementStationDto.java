package sflima.weatherapp.dto.airstation.station;

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
@Setter
@NoArgsConstructor
public class MeasurementStationDto implements Serializable {
    @JsonProperty("id")
    public Integer measurement_data_id;
    public Integer stationId;
    public ParamDto param;
}
