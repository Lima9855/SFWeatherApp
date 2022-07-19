package sflima.weatherapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sflima.weatherapp.model.airstationfindall.AirStationAll;
@Repository
public interface AirStationRepository extends JpaRepository<AirStationAll, Long> {

}
