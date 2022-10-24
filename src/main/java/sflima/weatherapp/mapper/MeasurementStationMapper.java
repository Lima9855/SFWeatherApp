package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dto.airstation.airstationdata.measurementstation.MeasurementStationDto;
import sflima.weatherapp.model.airstation.airstationdata.measurementstation.MeasurementStation;

@Mapper(componentModel = "spring")
public interface MeasurementStationMapper {

    MeasurementStation dtoToEntity(MeasurementStationDto measurementStationDto);

    MeasurementStationDto entityToDto(MeasurementStation measurementStation);

}
