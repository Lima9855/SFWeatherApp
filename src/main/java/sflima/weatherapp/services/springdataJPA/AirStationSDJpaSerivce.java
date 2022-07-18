package sflima.weatherapp.services.springdataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sflima.weatherapp.model.AirStation;
import sflima.weatherapp.repository.AirStationRepository;
import sflima.weatherapp.repository.CityRepository;
import sflima.weatherapp.repository.CommuneRepository;
import sflima.weatherapp.services.AirStationService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
    public AirStation getByStationName(String stationName) {
        return null;
    }

    @Override
    public Set<AirStation> findAll() {

        return new HashSet<>(airStationRepository.findAll()); // tutaj inteliJ sam podpowiedział jak właściwie zmienić ten kod na ten który poleciłeś
        // hashset wydawał mi się najlepszy z powodu tego że w razie czego nie przyjmie dwa razy tego samego obiektu, chyba że to niemożliwe
        // to wtedy faktycznie lista chyba byłaby szybsza w działaniu
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

    @Override
    public List<AirStation> saveAll(List<AirStation> airStationList) {

        List<AirStation> airStations = new ArrayList<>();

        airStationRepository.saveAll(airStationList);

        return airStations;
    }


}
