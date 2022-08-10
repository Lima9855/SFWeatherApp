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
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommuneDto implements Serializable {
    private  String communeName;
    private  String districtName;
    private  String provinceName;
}
