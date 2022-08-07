package sflima.weatherapp.dto1;

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
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DewpointDtoApi implements Serializable {
    @JsonProperty("celsius")
    private  Integer celsiusDewpoint;
    @JsonProperty("fahrenheit")
    private  Integer fahrenheitDewpoint;

    @Override
    public String toString() {
        return "DewpointDto{" +
                "celsiusDewpoint=" + celsiusDewpoint +
                ", fahrenheitDewpoint=" + fahrenheitDewpoint +
                '}';
    }
}
