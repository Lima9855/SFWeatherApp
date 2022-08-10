package sflima.weatherapp.services.airstationservices;

import sflima.weatherapp.repository.MeasurementStationRepository;

public class MeasurementStationService {

    private final MeasurementStationRepository measurementStationRepository;

    public MeasurementStationService(MeasurementStationRepository measurementStationRepository) {
        this.measurementStationRepository = measurementStationRepository;
    }
}
