package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dtoapi.airport.CloudDtoApi;
import sflima.weatherapp.model.airport.Cloud;

@Mapper(componentModel = "spring")
public interface CloudMapper {

    public Cloud cloudDtoToCloudEntity(CloudDtoApi dto);
}
