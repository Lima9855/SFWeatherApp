package sflima.weatherapp.services.jpaservice;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.airstationdata.quality.AirQualityIndex;
import sflima.weatherapp.repository.AirQualityIndexRepository;

@Service
public class AirQualityIndexJpaService {

    private final AirQualityIndexRepository airQualityIndexRepository;

    public AirQualityIndexJpaService(AirQualityIndexRepository airQualityIndexRepository) {
        this.airQualityIndexRepository = airQualityIndexRepository;
    }

    //public AirQualityIndex saveAirQualityIndex
}
