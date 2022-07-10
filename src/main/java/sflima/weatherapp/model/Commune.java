package sflima.weatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Commune extends BaseEntity {
    @Column(name = "communeName")
    private String communeName;
    @Column(name = "districtName")
    private String districtName;
    @Column(name = "provinceName")
    private String provinceName;
    @OneToOne
    @JoinColumn
    private City city;
}
