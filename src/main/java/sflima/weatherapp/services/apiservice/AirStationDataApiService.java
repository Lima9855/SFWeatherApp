package sflima.weatherapp.services.apiservice;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import sflima.weatherapp.dto.airstation.airstationdata.measurementdata.MeasurementDataDto;
import sflima.weatherapp.dto.airstation.airstationdata.indexairquality.AirQualityIndexDto;
import sflima.weatherapp.dto.airstation.airstationdata.measurementstation.MeasurementStationDto;

@Service
public class AirStationDataApiService {
    private final WebClient webClient;

    private final static String MEASUREMENT_STATION_URI = "station/sensors/";
    private final static String MEASUREMENT_DATA_URI = "data/getData/";
    private final static String AIR_QUALITY_INDEX_URI = "aqindex/getIndex/";


    public AirStationDataApiService(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://api.gios.gov.pl/pjp-api/rest/").build();
    }

    public MeasurementStationDto getMeasurementStation(int stationId) {
        return webClient.get()
                .uri(MEASUREMENT_STATION_URI + stationId)
                .retrieve()
                .bodyToMono(MeasurementStationDto.class)
                .block();
    }

    public MeasurementDataDto getMeasurementData(int sensorId) {
        return webClient.get()
                .uri(MEASUREMENT_DATA_URI + sensorId)
                .retrieve()
                .bodyToMono(MeasurementDataDto.class)
                .block();
    }

    public AirQualityIndexDto getAirQualityIndex(int stationId) {
        return webClient.get()
                .uri(AIR_QUALITY_INDEX_URI + stationId)
                .retrieve()
                .bodyToMono(AirQualityIndexDto.class)
                .block();
    }

}