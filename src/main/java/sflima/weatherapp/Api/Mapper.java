package sflima.weatherapp.Api;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {
    public static ObjectMapper objectMapper = getObjectMapper();

    public static ObjectMapper getObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper;
    }
}
