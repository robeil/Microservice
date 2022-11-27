package com.robeil.limitmicroservices.service.impl;

import com.robeil.limitmicroservices.entity.Limits;
import com.robeil.limitmicroservices.repository.LimitsRepository;
import com.robeil.limitmicroservices.service.LimitsService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LimitsServiceImpl implements LimitsService {

    @Autowired
    private LimitsRepository limitsRepository;

    @Override
    public Limits getLimits(int id) {
        return limitsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Limits> getAllLimits() {
        return limitsRepository.findAll();
    }

    @Override
    public void addNewLimit(Limits limits) {
        limitsRepository.save(limits);
    }
}
