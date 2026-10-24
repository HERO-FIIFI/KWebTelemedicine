package com.korlebu.service;

import com.korlebu.dto.PatientDTO;
import com.korlebu.util.PatientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements com.korlebu.service.PatientService {

    @Autowired
    private com.korlebu.repository.PatientRepository patientRepository;

    @Override
    public List<PatientDTO> getAllPatients() {
        List<com.korlebu.model.Patient> patients = patientRepository.findAll();
        return patients.stream()
                       .map(PatientUtil::convertToDTO)
                       .collect(Collectors.toList());
    }

    @Override
    public PatientDTO getPatientById(String id) {
        com.korlebu.model.Patient patient = patientRepository.findById(id).orElse(null);
        return PatientUtil.convertToDTO(patient);
    }

    @Override
    public PatientDTO addPatient(PatientDTO patientDTO) {
        Patient patient = PatientUtil.convertToEntity(patientDTO);
        Patient savedPatient = patientRepository.save(patient);
        return PatientUtil.convertToDTO(savedPatient);
    }

    @Override
    public PatientDTO updatePatient(String id, PatientDTO patientDTO) {
        Patient patient = patientRepository.findById(id).orElse(null);
        if (patient != null) {
            patient.setName(patientDTO.getName());
            patient.setAge(patientDTO.getAge());
            patient.setDiagnosis(patientDTO.getDiagnosis());
            patient.setDoctor(patientDTO.getDoctor());
            Patient updatedPatient = patientRepository.save(patient);
            return PatientUtil.convertToDTO(updatedPatient);
        }
        return null;
    }

    @Override
    public void deletePatient(String id) {
        patientRepository.deleteById(id);
    }
}
