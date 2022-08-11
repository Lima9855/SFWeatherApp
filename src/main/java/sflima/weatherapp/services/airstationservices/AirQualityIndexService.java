package sflima.weatherapp.services.airstationservices;

import org.springframework.stereotype.Service;
import sflima.weatherapp.repository.AirQualityIndexRepository;

@Service
public class AirQualityIndexService {

    private final AirQualityIndexRepository airQualityIndexRepository;

    public AirQualityIndexService(AirQualityIndexRepository airQualityIndexRepository) {
        this.airQualityIndexRepository = airQualityIndexRepository;
    }



}
