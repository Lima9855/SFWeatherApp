package sflima.weatherapp.dto.airportdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "results",
        "data"
})

@Getter
@AllArgsConstructor
public class AirPortDtoApi {

    private final Integer results;
    private final List<AirPortDataDtoApi> data = null;

    @Override
    public String toString() {
        return "Airport{" +
                "data=" + data +
                '}';
    }
}
