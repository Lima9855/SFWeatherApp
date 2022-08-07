package sflima.weatherapp.dto1;

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
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CloudDtoApi implements Serializable {
    private  String code;
    private  String text;

    @Override
    public String toString() {
        return "CloudDto{" +
                "code='" + code + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}