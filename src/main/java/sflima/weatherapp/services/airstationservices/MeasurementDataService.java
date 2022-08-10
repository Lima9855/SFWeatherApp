package sflima.weatherapp.services.airstationservices;

import sflima.weatherapp.repository.MeasurementDataRepository;

public class MeasurementDataService {

    private final MeasurementDataRepository measurementDataRepository;

    public MeasurementDataService(MeasurementDataRepository measurementDataRepository) {
        this.measurementDataRepository = measurementDataRepository;
    }
}
