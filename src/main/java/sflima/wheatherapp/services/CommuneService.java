package sflima.wheatherapp.services;

import sflima.wheatherapp.model.Commune;

public interface CommuneService extends CrudService<Commune, Long>{

    Commune findByCommuneName(String communeName);
    Commune findByDistrictName (String districtName);
    Commune findByProvinceName (String provinceName);
}
