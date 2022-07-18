package sflima.weatherapp.api;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static ObjectMapper getObjectMapper(){
        return objectMapper;
    }
}


// zrobić klase z configiem, co umożliwi testowanie