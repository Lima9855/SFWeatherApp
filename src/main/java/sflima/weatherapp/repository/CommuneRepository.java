package sflima.weatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.weatherapp.model.Commune;

public interface CommuneRepository extends CrudRepository<Commune,Long> {
    Commune findByCommuneName(String communeName);
    Commune findByDistrictName (String districtName);
    Commune findByProvinceName (String provinceName);
}
