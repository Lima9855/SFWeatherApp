package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sflima.weatherapp.model.airstation.airstationdata.measurementdata.MeasurementData;

public interface MeasurementDataRepository extends JpaRepository<MeasurementData, Long> {
}
