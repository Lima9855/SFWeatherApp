package sflima.weatherapp.model.airstation.airstationdata.quality;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class AirQualityIndex extends BaseEntity {

    public Integer station_id;
    public String stCalcDate;
    @Embedded
    public StIndexLevel stIndexLevel;
    public String stSourceDataDate;
    public String so2CalcDate;
    @Embedded
    public So2IndexLevel so2IndexLevel;
    public String so2SourceDataDate;
    public String no2CalcDate;
    @Embedded
    public No2IndexLevel no2IndexLevel;
    public String no2SourceDataDate;
    public String pm10CalcDate;
    @Embedded
    public Pm10IndexLevel pm10IndexLevel;
    public String pm10SourceDataDate;
    public String pm25CalcDate;
    @Embedded
    public Pm25IndexLevel pm25IndexLevel;
    public String pm25SourceDataDate;
    public String o3CalcDate;
    @Embedded
    public O3IndexLevel o3IndexLevel;
    public String o3SourceDataDate;
    public Boolean stIndexStatus;
    public String stIndexCrParam;

}
