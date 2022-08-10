package sflima.weatherapp.model.airstation.airstationdata.data;

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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementData extends BaseEntity {


    public String key;
    @OneToMany(cascade = CascadeType.ALL)
    public List<MeasurementValue> values = null;
}
