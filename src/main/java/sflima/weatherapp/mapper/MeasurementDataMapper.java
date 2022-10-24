package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dto.airstation.airstationdata.measurementdata.MeasurementDataDto;
import sflima.weatherapp.model.airstation.airstationdata.measurementdata.MeasurementData;

@Mapper(componentModel = "spring")
public interface MeasurementDataMapper {
    MeasurementData dtoToEntity (MeasurementDataDto measurementDataDto);

    MeasurementDataDto entityToDto(MeasurementData measurementData);
}
