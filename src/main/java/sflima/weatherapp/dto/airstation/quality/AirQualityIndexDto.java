package sflima.weatherapp.dto.airstation.quality;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "stCalcDate",
        "stIndexLevel",
        "stSourceDataDate",
        "so2CalcDate",
        "so2IndexLevel",
        "so2SourceDataDate",
        "no2CalcDate",
        "no2IndexLevel",
        "no2SourceDataDate",
        "pm10CalcDate",
        "pm10IndexLevel",
        "pm10SourceDataDate",
        "pm25CalcDate",
        "pm25IndexLevel",
        "pm25SourceDataDate",
        "o3CalcDate",
        "o3IndexLevel",
        "o3SourceDataDate",
        "stIndexStatus",
        "stIndexCrParam"
})
@AllArgsConstructor
@Getter
public class AirQualityIndexDto implements Serializable {
    private  Integer id_air_quality;
    private  String stCalcDate;
    private  StIndexLevelDto stIndexLevel;
    private  String stSourceDataDate;
    private  String so2CalcDate;
    private  So2IndexLevelDto so2IndexLevel;
    private  String so2SourceDataDate;
    private  String no2CalcDate;
    private  No2IndexLevelDto no2IndexLevel;
    private  String no2SourceDataDate;
    private  String pm10CalcDate;
    private  Pm10IndexLevelDto pm10IndexLevel;
    private  String pm10SourceDataDate;
    private  Object pm25CalcDate;
    private  Object pm25IndexLevel;
    private  Object pm25SourceDataDate;
    private  String o3CalcDate;
    private  O3IndexLevelDto o3IndexLevel;
    private  String o3SourceDataDate;
    private  Boolean stIndexStatus;
    private  String stIndexCrParam;
}
