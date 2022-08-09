package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sflima.weatherapp.model.airstation.airstationdata.data.MeasurementData;

public interface MeasurementDataRepository extends JpaRepository<MeasurementData, Long> {
}
