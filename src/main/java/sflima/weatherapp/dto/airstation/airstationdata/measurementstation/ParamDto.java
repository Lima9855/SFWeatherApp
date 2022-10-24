package sflima.weatherapp.dto.airstation.airstationdata.measurementstation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "paramName",
        "paramFormula",
        "paramCode",
        "idParam"
})

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ParamDto {
    public String paramName;
    public String paramFormula;
    public String paramCode;
    public Integer idParam;
}
