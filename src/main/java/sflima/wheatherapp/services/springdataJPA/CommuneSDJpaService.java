package sflima.wheatherapp.services.springdataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sflima.wheatherapp.model.Commune;
import sflima.wheatherapp.repository.CommuneRepository;
import sflima.wheatherapp.services.CommuneService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class CommuneSDJpaService implements CommuneService {

    private final CommuneRepository communeRepository;

    public CommuneSDJpaService(CommuneRepository communeRepository) {
        this.communeRepository = communeRepository;
    }

    @Override
    public Commune findByCommuneName(String communeName) {
        return communeRepository.findByCommuneName(communeName);
    }

    @Override
    public Commune findByDistrictName(String districtName) {
        return communeRepository.findByDistrictName(districtName);
    }

    @Override
    public Commune findByProvinceName(String provinceName) {
        return communeRepository.findByProvinceName(provinceName);
    }

    @Override
    public Set<Commune> findAll() {

        Set<Commune> communes = new HashSet<>();

        communeRepository.findAll().forEach(communes::add);

        return communes;
    }

    @Override
    public Commune findById(Long aLong) {
        return communeRepository.findById(aLong).get();
    }

    @Override
    public Commune save(Commune object) {
        return communeRepository.save(object);
    }

    @Override
    public void delete(Commune object) {
        communeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        communeRepository.deleteById(aLong);
    }
}
