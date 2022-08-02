package sflima.weatherapp.mapper;

import org.mapstruct.Mapper;
import sflima.weatherapp.dto.CloudDto;
import sflima.weatherapp.model.airport.Cloud;

@Mapper(componentModel = "spring")
public interface CloudMapper {

    public Cloud cloudDtoToCloudEntity(CloudDto dto);
}
