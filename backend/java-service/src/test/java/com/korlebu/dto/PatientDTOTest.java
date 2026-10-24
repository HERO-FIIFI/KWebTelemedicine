package com.korlebu.dto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PatientDTOTest { @Test void storesPatientFields(){ PatientDTO dto=new PatientDTO("1","Ama",32,"Review","Dr K"); assertEquals("Ama",dto.getName()); assertEquals(32,dto.getAge()); assertEquals("Review",dto.getDiagnosis()); assertEquals("Dr K",dto.getDoctor()); } }
