package sflima.weatherapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sflima.weatherapp.model.airstation.airstationall.AirStationAll;

import java.util.List;
import java.util.Set;

@Repository
public interface AirStationAllRepository extends JpaRepository<AirStationAll, Long> {

    List<AirStationAll> findByCity_Name(String name);

    boolean existsAirStationAllsByAddressStreetAndStationIdentyficatorAndStationName(String addressStreet, Integer stationIdentyficator, String stationName);

    boolean existsAirStationAllByAddressStreetAndStationIdentyficatorAndStationName(String addressStreet, Integer stationIdentyficator, String stationName);

}
