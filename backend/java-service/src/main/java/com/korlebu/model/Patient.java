package com.korlebu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patients")
public class Patient {
    @Id
    private String id;
    private String name;
    private int age;
    private String diagnosis;
    private String doctor;

    public Patient() {}

    public Patient(String name, int age, String diagnosis, String doctor) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.doctor = doctor;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    
    public String getDoctor() { return doctor; }
    public void setDoctor(String doctor) { this.doctor = doctor; }
}

