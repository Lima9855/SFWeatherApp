package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "results",
    "data"
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirPortDto extends BaseEntity {

    private Integer results;
    private List<AirPortDataDto> data = null;


    @Override
    public String toString() {
        return "Airport{" +
                "data=" + data +
                '}';
    }
}
