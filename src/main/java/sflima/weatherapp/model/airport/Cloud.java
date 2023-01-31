
package sflima.weatherapp.model.airport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Cloud {
    @Column(name = "code_cloud")
    private String code;
    @Column(name = "text_cloud")
    private String text;

    @Override
    public String toString() {
        return "Cloud{" +
                "code='" + code + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
