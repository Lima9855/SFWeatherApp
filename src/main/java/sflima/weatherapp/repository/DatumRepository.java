package sflima.weatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.weatherapp.model.airport.Datum;

import java.util.Optional;

public interface DatumRepository extends CrudRepository<Datum, Long> {

    //Optional<Datum> findDatumByIcao(String icao);

}
