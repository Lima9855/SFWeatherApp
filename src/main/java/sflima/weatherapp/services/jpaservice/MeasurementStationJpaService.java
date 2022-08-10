package sflima.weatherapp.services.jpaservice;

import sflima.weatherapp.repository.MeasurementStationRepository;

public class MeasurementStationJpaService {

    private final MeasurementStationRepository measurementStationRepository;

    public MeasurementStationJpaService(MeasurementStationRepository measurementStationRepository) {
        this.measurementStationRepository = measurementStationRepository;
    }

    //public
}
