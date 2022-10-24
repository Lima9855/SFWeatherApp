package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import sflima.weatherapp.dto.airportdata.AirPortDataDtoApi;
import sflima.weatherapp.dto.airport.AirPortDataDto;
import sflima.weatherapp.model.airport.AirPortData;

import java.util.List;

@Mapper(componentModel = "spring" , uses = { CloudMapper.class, GeoMapper.class})
public abstract class AirPortDataMapper {

    @Autowired
    protected CloudMapper cloudMapper;

    @Mapping(target ="clouds" ,expression = "java(cloudMapper.cloudDtoToCloudEntity(dto.getClouds().get(0)))")
    public  abstract AirPortData dtoToEntity(AirPortDataDtoApi dto);

    public abstract AirPortDataDto entityToDto(AirPortData airPortData);

    public abstract List<AirPortDataDto> entitiesToDtos(List<AirPortData> airPortDataList);
}
