package sflima.weatherapp.services.airstationservices;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.airstationdata.indexairquality.AirQualityIndex;
import sflima.weatherapp.repository.AirQualityIndexRepository;

@Service
public class AirQualityIndexService {

    private final AirQualityIndexRepository airQualityIndexRepository;

    public AirQualityIndexService(AirQualityIndexRepository airQualityIndexRepository) {
        this.airQualityIndexRepository = airQualityIndexRepository;
    }

    public AirQualityIndex save(AirQualityIndex airQualityIndex) {
        return airQualityIndexRepository.save(airQualityIndex);
    }

    public void delete(Long id){
        airQualityIndexRepository.deleteById(id);
    }
}
