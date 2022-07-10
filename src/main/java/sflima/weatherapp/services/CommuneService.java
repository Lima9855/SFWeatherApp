package sflima.weatherapp.services;

import sflima.weatherapp.model.Commune;

public interface CommuneService extends CrudService<Commune, Long>{

    Commune findByCommuneName(String communeName);
    Commune findByDistrictName (String districtName);
    Commune findByProvinceName (String provinceName);
}
