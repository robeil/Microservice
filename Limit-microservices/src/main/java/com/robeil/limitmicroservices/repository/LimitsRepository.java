package com.robeil.limitmicroservices.repository;

import com.robeil.limitmicroservices.entity.Limits;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitsRepository extends MongoRepository<Limits, Integer> {

}
