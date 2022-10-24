package sflima.weatherapp.dto.airstation.airstationall;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "communeName",
        "districtName",
        "provinceName"
})

@Getter
@AllArgsConstructor
public class CommuneDto {
    private final String communeName;
    private final String districtName;
    private final String provinceName;
}
