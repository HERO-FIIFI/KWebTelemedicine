package com.korlebu.service;

import com.korlebu.dto.PatientDTO;

import java.util.List;

public interface PatientService {
    List<PatientDTO> getAllPatients();
    PatientDTO getPatientById(String id);
    PatientDTO addPatient(PatientDTO patientDTO);
    PatientDTO updatePatient(String id, PatientDTO patientDTO);
    void deletePatient(String id);
}
