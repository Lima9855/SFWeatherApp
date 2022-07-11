package sflima.weatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "city")
public class City extends BaseEntity{
    /*@Column(name = "cityIdentyficator")
    private int cityIdentyficator;*/
    @Column(name = "cityName")
    private String name;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "city")
    @JoinColumn(name = "commune")
    private Commune commune;
    @OneToOne
    @JoinColumn
    private AirStation airStation;
}
