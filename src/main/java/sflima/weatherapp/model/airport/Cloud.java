
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Cloud {

    private String code;
    private String text;

    @Override
    public String toString() {
        return "Cloud{" +
                "code='" + code + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
