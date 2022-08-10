package sflima.weatherapp.model.airstation.airstationdata.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementValue extends BaseEntity {

    @ManyToOne
    public MeasurementData measurementData;
    public String date;
    public Float value;
}
