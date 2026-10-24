package com.korlebu.dto;\n\nimport jakarta.validation.constraints.Max;\nimport jakarta.validation.constraints.Min;\nimport jakarta.validation.constraints.NotBlank;

public class PatientDTO {
    private String id;
    @NotBlank\n    private String name;
    @Min(0)\n    @Max(130)\n    private int age;
    @NotBlank\n    private String diagnosis;
    @NotBlank\n    private String doctor;

    public PatientDTO() {}

    public PatientDTO(String id, String name, int age, String diagnosis, String doctor) {
        this.id = id;
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

