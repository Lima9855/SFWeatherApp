package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dto.airstation.airstationall.AirStationDto;
import sflima.weatherapp.model.airstation.airstationall.AirStation;

import java.util.List;
@Mapper(componentModel = "spring")
public interface AirStationMapper {

    List<AirStation> dtosToEntities (List<AirStationDto> dtos);

    AirStation dtoToEntity(AirStationDto dto);

    AirStationDto entityToDto (AirStation entity);
}
