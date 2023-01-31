package sflima.weatherapp.model.airstation.airstationdata.indexairquality;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirQualityIndex {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;
    private Integer stationId;
    private String stCalcDate;
    @Embedded
    private StIndexLevel stIndexLevel;
    private String stSourceDataDate;
    private String so2CalcDate;
    @Embedded
    private So2IndexLevel so2IndexLevel;
    private String so2SourceDataDate;
    private String no2CalcDate;
    @Embedded
    private No2IndexLevel no2IndexLevel;
    private String no2SourceDataDate;
    private String pm10CalcDate;
    @Embedded
    private Pm10IndexLevel pm10IndexLevel;
    private String pm10SourceDataDate;
    private String pm25CalcDate;
    @Embedded
    private Pm25IndexLevel pm25IndexLevel;
    private String pm25SourceDataDate;
    private String o3CalcDate;
    @Embedded
    private O3IndexLevel o3IndexLevel;
    private String o3SourceDataDate;
    private Boolean stIndexStatus;
    private String stIndexCrParam;

}
