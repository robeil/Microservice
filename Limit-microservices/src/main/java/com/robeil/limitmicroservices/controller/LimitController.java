package com.robeil.limitmicroservices.controller;

import com.robeil.limitmicroservices.configuration.Configuration;
import com.robeil.limitmicroservices.entity.Limits;
import com.robeil.limitmicroservices.service.LimitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/limits")
public class LimitController {

    @Autowired
    private Configuration configuration;
//    @Autowired
//    private LimitsService limitsService;

    @GetMapping
    public Limits getLimit(){
        return new Limits(1,configuration.getMaximum(), configuration.getMinimum());
    }

//    @PostMapping
//    public void addNewLimits(@RequestBody Limits limits){
//        limitsService.addNewLimit(limits);
//    }

//    @GetMapping
//    public List<Limits> getAllLimits(){
//        return limitsService.getAllLimits();
//    }
}
