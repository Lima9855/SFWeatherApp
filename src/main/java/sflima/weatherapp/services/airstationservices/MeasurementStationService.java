package sflima.weatherapp.services.airstationservices;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.airstationdata.measurementdata.MeasurementData;
import sflima.weatherapp.model.airstation.airstationdata.measurementstation.MeasurementStation;
import sflima.weatherapp.repository.MeasurementStationRepository;

import java.util.List;

@Service
public class MeasurementStationService {

    private final MeasurementStationRepository measurementStationRepository;

    public MeasurementStationService(MeasurementStationRepository measurementStationRepository) {
        this.measurementStationRepository = measurementStationRepository;
    }

    public MeasurementStation save(MeasurementStation measurementStation) {
        return measurementStationRepository.save(measurementStation);
    }

    public List<MeasurementStation> saveAll(List<MeasurementStation> measurementStation) {
        return measurementStationRepository.saveAll(measurementStation);
    }

    public void delete(Long id) {
        measurementStationRepository.deleteById(id);
    }
}
