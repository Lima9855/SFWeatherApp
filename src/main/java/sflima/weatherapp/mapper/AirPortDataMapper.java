package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sflima.weatherapp.dto.AirPortDataDto;
import sflima.weatherapp.model.airport.AirPortData;

@Mapper(componentModel = "spring")
public interface AirPortDataMapper {


    AirPortData dtoToEntity(AirPortDataDto airPortDataDto);
    AirPortDataDto entityToDto(AirPortData airPortData);

    //@Mapping(target = "pole " , ignore = true)
}
