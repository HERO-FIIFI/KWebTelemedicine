package com.korlebu.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class PatientDTO {
    private String id;
    @NotBlank private String name;
    @Min(0) @Max(130) private int age;
    @NotBlank private String diagnosis;
    @NotBlank private String doctor;
    public PatientDTO() {}
    public PatientDTO(String id,String name,int age,String diagnosis,String doctor){this.id=id;this.name=name;this.age=age;this.diagnosis=diagnosis;this.doctor=doctor;}
    public String getId(){return id;} public void setId(String id){this.id=id;}
    public String getName(){return name;} public void setName(String name){this.name=name;}
    public int getAge(){return age;} public void setAge(int age){this.age=age;}
    public String getDiagnosis(){return diagnosis;} public void setDiagnosis(String diagnosis){this.diagnosis=diagnosis;}
    public String getDoctor(){return doctor;} public void setDoctor(String doctor){this.doctor=doctor;}
}
