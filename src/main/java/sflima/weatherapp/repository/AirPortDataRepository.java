package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sflima.weatherapp.model.airport.AirPortData;

import java.util.List;

@Repository
public interface AirPortDataRepository extends JpaRepository<AirPortData, Long> {

    List<AirPortData> findByIcao(String icao);

    List<AirPortData> findByTemperature_CelsiusTemperature(Integer temp);

    boolean existsAirPortDataByIcaoAndObserved(String icao, String observed);

}
