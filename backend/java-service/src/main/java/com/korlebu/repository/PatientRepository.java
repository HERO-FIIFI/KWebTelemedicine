package com.korlebu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<com.korlebu.model.Patient, String> {
    // Additional query methods can be defined here if needed.
}
