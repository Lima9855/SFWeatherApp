package sflima.weatherapp.dto.airportdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "text"
})
@Getter
@AllArgsConstructor
public class CloudDtoApi {
    private final String code;
    private final String text;

    @Override
    public String toString() {
        return "CloudDto{" +
                "code='" + code + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
