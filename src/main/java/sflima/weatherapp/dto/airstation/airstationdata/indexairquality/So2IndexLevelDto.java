package sflima.weatherapp.dto.airstation.airstationdata.indexairquality;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)

@AllArgsConstructor
@Getter
public class So2IndexLevelDto {
    private final Integer id_lvl;
    private final String indexLevelName;
}
