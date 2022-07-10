package sflima.wheatherapp.services.springdataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sflima.wheatherapp.model.AirPort;
import sflima.wheatherapp.model.AirStation;
import sflima.wheatherapp.repository.AirStationRepository;
import sflima.wheatherapp.repository.AirportRepository;
import sflima.wheatherapp.repository.CityRepository;
import sflima.wheatherapp.repository.CommuneRepository;
import sflima.wheatherapp.services.AirStationService;
import sflima.wheatherapp.services.AirportService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class AirStationSDJpaSerivce implements AirStationService {

    private final AirStationRepository airStationRepository;
    private final CityRepository cityRepository;
    private final CommuneRepository communeRepository;

    public AirStationSDJpaSerivce(AirStationRepository airStationRepository, CityRepository cityRepository, CommuneRepository communeRepository) {
        this.airStationRepository = airStationRepository;
        this.cityRepository = cityRepository;
        this.communeRepository = communeRepository;
    }

    @Override
    public AirStation findByStationId(int stationId) {
        return null;
    }

    @Override
    public AirStation findByStationName(String stationName) {
        return null;
    }

    @Override
    public Set<AirStation> findAll() {

        Set<AirStation> airStations = new HashSet<>();

        airStationRepository.findAll().forEach(airStations::add);

        return airStations;
    }

    @Override
    public AirStation findById(Long aLong) {
        return airStationRepository.findById(aLong).get();
    }

    @Override
    public AirStation save(AirStation object) {
        return airStationRepository.save(object);
    }

    @Override
    public void delete(AirStation object) {
        airStationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        airStationRepository.deleteById(aLong);
    }
}
