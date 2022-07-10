package sflima.weatherapp.services.springdataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sflima.weatherapp.model.City;
import sflima.weatherapp.repository.CityRepository;
import sflima.weatherapp.repository.CommuneRepository;
import sflima.weatherapp.services.CityService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class CitySDJpaService implements CityService {

    private final CityRepository cityRepository;
    private final CommuneRepository communeRepository;

    public CitySDJpaService(CityRepository cityRepository, CommuneRepository communeRepository) {
        this.cityRepository = cityRepository;
        this.communeRepository = communeRepository;
    }

    @Override
    public City findByCityId(int cityIdentyficator) {
        return cityRepository.findByCityIdentyficator(cityIdentyficator);
    }

    @Override
    public City findByCityName(String cityName) {
        return cityRepository.findByCityName(cityName);
    }

    @Override
    public Set findAll() {

        Set<City> cities = new HashSet<>();

        cityRepository.findAll().forEach(cities::add);

        return cities;
    }

    @Override
    public City findById(Long aLong) {
        return cityRepository.findById(aLong).get();
    }

    @Override
    public City save(City object) {
        return cityRepository.save(object);
    }

    @Override
    public void delete(City object) {
        cityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        cityRepository.deleteById(aLong);
    }

}
