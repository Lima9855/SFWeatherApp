package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sflima.weatherapp.dtoapi.airport.GeometryDtoApi;
import sflima.weatherapp.model.airport.Geometry;

@Mapper(componentModel = "spring")
public interface GeoMapper {
    //converting list of floats coordinatesdto to String coordinates entity
    @Mapping(target = "coordinateX", expression = "java(dto.getCoordinates().get(0))")
    @Mapping(target = "coordinateY", expression = "java(dto.getCoordinates().get(1))")
    public Geometry geoDtoToGeoEntity(GeometryDtoApi dto);
}
