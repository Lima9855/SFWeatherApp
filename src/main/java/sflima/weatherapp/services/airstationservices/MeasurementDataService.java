package sflima.weatherapp.services.airstationservices;

import org.springframework.stereotype.Service;
import sflima.weatherapp.model.airstation.airstationdata.measurementdata.MeasurementData;
import sflima.weatherapp.repository.MeasurementDataRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MeasurementDataService {

    private final MeasurementDataRepository measurementDataRepository;

    public MeasurementDataService(MeasurementDataRepository measurementDataRepository) {
        this.measurementDataRepository = measurementDataRepository;
    }

    public MeasurementData save(MeasurementData measurementData) {
        return measurementDataRepository.save(measurementData);
    }

    public List<MeasurementData> saveAll(List<MeasurementData> measurementData) {
        return measurementDataRepository.saveAll(measurementData);
    }

    public Optional<MeasurementData> findById(Long id){
        return measurementDataRepository.findById(id);
    }

    public List<MeasurementData> findAll(){
        return measurementDataRepository.findAll();
    }

    public void delete(Long id) {
        measurementDataRepository.deleteById(id);
    }



}
