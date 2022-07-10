package sflima.weatherapp.services.springdataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sflima.weatherapp.model.AirPort;
import sflima.weatherapp.repository.AirportRepository;
import sflima.weatherapp.services.AirportService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class AirPortSDJpaService implements AirportService {

    private final AirportRepository airportRepository;

    public AirPortSDJpaService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public AirPort findByName(String name) {
        return airportRepository.findByName(name);
    }

    @Override
    public AirPort findByIcao(String icao) {
        return airportRepository.findByIcao(icao);
    }

    @Override
    public Set<AirPort> findAll() {

        Set<AirPort> airPorts = new HashSet<>();

        airportRepository.findAll().forEach(airPorts::add);
        return airPorts;
    }

    @Override
    public AirPort findById(Long aLong) {
        return airportRepository.findById(aLong).get();
    }

    @Override
    public AirPort save(AirPort object) {
        return airportRepository.save(object);
    }

    @Override
    public void delete(AirPort object) {
        airportRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        airportRepository.deleteById(aLong);
    }
}
