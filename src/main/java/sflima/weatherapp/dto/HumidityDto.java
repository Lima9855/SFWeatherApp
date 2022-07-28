package sflima.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "percent"
})
@Getter
public class HumidityDto implements Serializable {
    @JsonProperty("percent")
    private Integer percent;

    public HumidityDto(Integer percent) {
        this.percent = percent;
    }

    public HumidityDto() {
    }
}
