package sflima.weatherapp.dto.airstation.airstationall;

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
        "name",
        "commune"
})

@Getter
@AllArgsConstructor
public class CityDto {
    @JsonProperty("id")
    private final Integer id_station;
    private final String name;
    private final CommuneDto commune;
}
