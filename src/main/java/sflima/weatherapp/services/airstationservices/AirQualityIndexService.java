package sflima.weatherapp.services.airstationservices;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.airstationall.AirStation;
import sflima.weatherapp.model.airstation.airstationdata.indexairquality.AirQualityIndex;
import sflima.weatherapp.repository.AirQualityIndexRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AirQualityIndexService {

    private final AirQualityIndexRepository airQualityIndexRepository;

    public AirQualityIndexService(AirQualityIndexRepository airQualityIndexRepository) {
        this.airQualityIndexRepository = airQualityIndexRepository;
    }

    public AirQualityIndex save(AirQualityIndex airQualityIndex) {
        return airQualityIndexRepository.save(airQualityIndex);
    }

    public Optional<AirQualityIndex> findById(Long id){
        return airQualityIndexRepository.findById(id);
    }

    public List<AirQualityIndex> findAll() {
        return airQualityIndexRepository.findAll();
    }

    public void delete(Long id){
        airQualityIndexRepository.deleteById(id);
    }
}
