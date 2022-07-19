
package sflima.weatherapp.model.airport;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;
//import sflima.weatherapp.model.BaseEntity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "results",
    "data"
})
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Airport extends BaseEntity {

    @JsonProperty("results")
    private Integer results;
    @JsonProperty("data")
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "airport")
    private List<Datum> data = null;

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "data=" + data +
                '}';
    }
}
