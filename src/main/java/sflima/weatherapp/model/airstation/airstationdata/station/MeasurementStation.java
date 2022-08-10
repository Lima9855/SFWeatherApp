package sflima.weatherapp.model.airstation.airstationdata.station;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementStation extends BaseEntity {

    public Integer measurement_data_id;
    public Integer stationId;
    @Embedded
    public Param param;
}
