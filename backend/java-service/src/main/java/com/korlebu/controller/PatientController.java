package com.korlebu.controller;
import com.korlebu.audit.*; import com.korlebu.dto.PatientDTO; import com.korlebu.service.PatientService; import jakarta.validation.Valid; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/patients")
public class PatientController {
 private final PatientService patientService; private final AuditEventRepository audit;
 public PatientController(PatientService patientService, AuditEventRepository audit){this.patientService=patientService;this.audit=audit;}
 @GetMapping public List<PatientDTO> getAllPatients(){audit.save(new AuditEvent("LIST","patient",null));return patientService.getAllPatients();}
 @GetMapping("/{id}") public ResponseEntity<PatientDTO> getPatientById(@PathVariable String id){PatientDTO p=patientService.getPatientById(id);if(p==null)return ResponseEntity.notFound().build();audit.save(new AuditEvent("READ","patient",id));return ResponseEntity.ok(p);}
 @PostMapping public ResponseEntity<PatientDTO> addPatient(@Valid @RequestBody PatientDTO dto){PatientDTO p=patientService.addPatient(dto);audit.save(new AuditEvent("CREATE","patient",p.getId()));return ResponseEntity.status(HttpStatus.CREATED).body(p);}
 @PutMapping("/{id}") public ResponseEntity<PatientDTO> updatePatient(@PathVariable String id,@Valid @RequestBody PatientDTO dto){PatientDTO p=patientService.updatePatient(id,dto);if(p==null)return ResponseEntity.notFound().build();audit.save(new AuditEvent("UPDATE","patient",id));return ResponseEntity.ok(p);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> deletePatient(@PathVariable String id){patientService.deletePatient(id);audit.save(new AuditEvent("DELETE","patient",id));return ResponseEntity.noContent().build();}
}
