package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sflima.weatherapp.dto.airportdata.GeometryDtoApi;
import sflima.weatherapp.model.airport.Geometry;

@Mapper(componentModel = "spring")
public interface GeoMapper {
    @Mapping(target = "coordinateX", expression = "java(dto.getCoordinates().get(0))")
    @Mapping(target = "coordinateY", expression = "java(dto.getCoordinates().get(1))")
    Geometry geoDtoToGeoEntity(GeometryDtoApi dto);
}
