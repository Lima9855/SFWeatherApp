package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sflima.weatherapp.model.airstation.airstationdata.indexairquality.AirQualityIndex;

public interface AirQualityIndexRepository extends JpaRepository<AirQualityIndex,Long> {
}
