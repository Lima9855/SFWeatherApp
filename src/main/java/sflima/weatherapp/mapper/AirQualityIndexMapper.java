package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dto.airstation.airstationdata.indexairquality.AirQualityIndexDto;
import sflima.weatherapp.model.airstation.airstationdata.indexairquality.AirQualityIndex;

@Mapper(componentModel = "spring")
public interface AirQualityIndexMapper {

    AirQualityIndex dtoToEntity(AirQualityIndexDto airQualityIndexDto);

    AirQualityIndexDto entityToDto (AirQualityIndex airQualityIndex);
}
