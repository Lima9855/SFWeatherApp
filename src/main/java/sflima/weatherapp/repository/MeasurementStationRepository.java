package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sflima.weatherapp.model.airstation.airstationdata.station.MeasurementStation;

public interface MeasurementStationRepository extends JpaRepository<MeasurementStation, Long> {
}
