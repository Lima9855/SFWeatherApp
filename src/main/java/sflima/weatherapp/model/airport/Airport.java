package sflima.weatherapp.model.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Airport extends BaseEntity {

    private Integer results;
    @OneToMany(cascade = CascadeType.ALL)
    private List<AirPortData> data = null;

    @Override
    public String toString() {
        return "Airport{" +
                "results=" + results +
                ", data=" + data +
                '}';
    }
}
