package sflima.weatherapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sflima.weatherapp.model.airstation.airstationall.AirStation;

import java.util.List;

@Repository
public interface AirStationRepository extends JpaRepository<AirStation, Long> {

    List<AirStation> findByCity_Name(String name);

    boolean existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(String addressStreet, Integer stationIdentyficator, String stationName);

}
