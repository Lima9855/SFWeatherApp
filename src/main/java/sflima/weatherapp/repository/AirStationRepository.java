package sflima.weatherapp.repository;



public interface AirStationRepository extends JpaRepository<AirStation, Long> {
    //AirStation findByStationId (int stationId);
    AirStation findByStationName (String stationName);
}
