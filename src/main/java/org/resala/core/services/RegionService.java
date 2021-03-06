package org.resala.core.services;

import org.resala.core.entities.RegionEntity;
import org.resala.core.repository.RegionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    RegionService(final RegionRepository xRegionRepository) {
        regionRepository = xRegionRepository;
    }

    public void saveData(final RegionEntity regionEntity) {
        regionRepository.save(regionEntity);
    }

    public List<RegionEntity> getAllRegions() {
        return regionRepository.findAll();
    }

    public RegionEntity getRegionById(final Long id) {
        return regionRepository.findById(id).get();
    }
}
