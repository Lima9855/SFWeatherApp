package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class AirPort extends BaseEntity {

    @JsonProperty("results")
    private Integer results;
    @JsonProperty("data")
    private List<AirPortData> data = null;


    @Override
    public String toString() {
        return "Airport{" +
                "data=" + data +
                '}';
    }
}
