package com.korlebu.util;
import com.korlebu.dto.PatientDTO;
import com.korlebu.model.Patient;

public class PatientUtil {
    public static PatientDTO convertToDTO(Patient patient) {
        if(patient == null) return null;
        PatientDTO dto = new PatientDTO();
        dto.setId(patient.getId());
        dto.setName(patient.getName());
        dto.setAge(patient.getAge());
        dto.setDiagnosis(patient.getDiagnosis());
        dto.setDoctor(patient.getDoctor());
        return dto;
    }

    public static Patient convertToEntity(PatientDTO dto) {
        if(dto == null) return null;
        Patient patient = new Patient();
        patient.setName(dto.getName());
        patient.setAge(dto.getAge());
        patient.setDiagnosis(dto.getDiagnosis());
        patient.setDoctor(dto.getDoctor());
        return patient;
    }
}
