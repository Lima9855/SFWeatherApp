package sflima.weatherapp.services.jpaservice;

import sflima.weatherapp.repository.MeasurementDataRepository;

public class MeasurementDataJpaService {

    private final MeasurementDataRepository measurementDataRepository;

    public MeasurementDataJpaService(MeasurementDataRepository measurementDataRepository) {
        this.measurementDataRepository = measurementDataRepository;
    }
}
