package sflima.weatherapp.dtoapi.airport;

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
        "feet",
        "meters"
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ElevationDtoApi implements Serializable {
    private  Integer feet;
    @JsonProperty("meters")
    private  Integer metersElevation;
}
