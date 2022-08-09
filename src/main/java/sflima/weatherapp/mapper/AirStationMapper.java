package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sflima.weatherapp.dto.airstation.airstationall.AirStationAllDto;
import sflima.weatherapp.model.airstation.airstationall.AirStationAll;

import java.util.List;
@Mapper(componentModel = "spring")
public interface AirStationMapper {


    List<AirStationAll> dtosToEntities (List<AirStationAllDto> dtos);

    AirStationAll dtoToEntity(AirStationAllDto dto);

    AirStationAllDto entityToDto (AirStationAll entity);
}
