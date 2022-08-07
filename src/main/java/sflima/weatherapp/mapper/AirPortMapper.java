package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dto1.AirPortDtoApi;
import sflima.weatherapp.model.airport.Airport;

@Mapper(componentModel = "spring" , uses = AirPortDataMapper.class)
public interface AirPortMapper {

    public Airport dtoToEntity(AirPortDtoApi dto);
}
