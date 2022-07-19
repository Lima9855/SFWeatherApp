package sflima.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sflima.weatherapp.model.airport.Datum;

@Repository
public interface DatumRepository extends JpaRepository<Datum, Long> {

}
