package com.robeil.limitmicroservices.service;

import com.robeil.limitmicroservices.entity.Limits;

import java.util.List;

public interface LimitsService {

    Limits getLimits(int id);
    List<Limits> getAllLimits();
    void addNewLimit(Limits limits);
}
