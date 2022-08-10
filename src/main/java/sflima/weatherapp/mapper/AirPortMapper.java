package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dtoapi.airport.AirPortDtoApi;
import sflima.weatherapp.model.airport.Airport;

@Mapper(componentModel = "spring" , uses = AirPortDataMapper.class)
public interface AirPortMapper {

    public Airport dtoToEntity(AirPortDtoApi dto);
}
