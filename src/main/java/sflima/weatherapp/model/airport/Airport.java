package sflima.weatherapp.model.airport;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Airport{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;
    private Integer results;
    @OneToMany(cascade = CascadeType.ALL)
    private List<AirPortData> data = null;

    public AirPortData getAirPortData() {
        return data.get(0);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "results=" + results +
                ", data=" + data +
                '}';
    }
}
