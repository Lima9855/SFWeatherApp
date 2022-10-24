package sflima.weatherapp.dto.airportdata;

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
        "celsius",
        "fahrenheit"
})

@Getter
@AllArgsConstructor
public class DewpointDtoApi {
    @JsonProperty("celsius")
    private final  Integer celsiusDewpoint;
    @JsonProperty("fahrenheit")
    private final  Integer fahrenheitDewpoint;

    @Override
    public String toString() {
        return "DewpointDto{" +
                "celsiusDewpoint=" + celsiusDewpoint +
                ", fahrenheitDewpoint=" + fahrenheitDewpoint +
                '}';
    }
}
