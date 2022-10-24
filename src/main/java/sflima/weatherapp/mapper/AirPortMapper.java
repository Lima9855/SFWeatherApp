package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dto.airportdata.AirPortDataDtoApi;
import sflima.weatherapp.dto.airportdata.AirPortDtoApi;
import sflima.weatherapp.model.airport.Airport;

@Mapper(componentModel = "spring" , uses = AirPortDataMapper.class)
public interface AirPortMapper {

     Airport dtoToEntity(AirPortDtoApi airPortDtoApi);

     AirPortDataDtoApi entityToDto(Airport airport);
}
