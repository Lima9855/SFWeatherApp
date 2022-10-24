package sflima.weatherapp.dto.airstation.airstationdata.indexairquality;

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
public class AirQualityIndexDto {
    private final Integer id_air_quality;
    private final String stCalcDate;
    private final StIndexLevelDto stIndexLevel;
    private final String stSourceDataDate;
    private final String so2CalcDate;
    private final So2IndexLevelDto so2IndexLevel;
    private final String so2SourceDataDate;
    private final String no2CalcDate;
    private final No2IndexLevelDto no2IndexLevel;
    private final String no2SourceDataDate;
    private final String pm10CalcDate;
    private final Pm10IndexLevelDto pm10IndexLevel;
    private final String pm10SourceDataDate;
    private final String pm25CalcDate;
    private final Pm25IndexLevelDto pm25IndexLevel;
    private final String pm25SourceDataDate;
    private final String o3CalcDate;
    private final O3IndexLevelDto o3IndexLevel;
    private final String o3SourceDataDate;
    private final Boolean stIndexStatus;
    private final String stIndexCrParam;
}
