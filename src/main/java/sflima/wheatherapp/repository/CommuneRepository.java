package sflima.wheatherapp.repository;

import org.springframework.data.repository.CrudRepository;
import sflima.wheatherapp.model.Commune;

public interface CommuneRepository extends CrudRepository<Commune,Long> {
    Commune findByCommuneName(String communeName);
    Commune findByDistrictName (String districtName);
    Commune findByProvinceName (String provinceName);
}
