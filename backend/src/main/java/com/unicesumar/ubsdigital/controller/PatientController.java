package com.unicesumar.ubsdigital.controller;

import com.unicesumar.ubsdigital.model.domain.Patient;
import com.unicesumar.ubsdigital.model.repository.PatientRepository;
import com.unicesumar.ubsdigital.model.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientRepository patientRepository;
    private final UserService userService;

    public PatientController(PatientRepository patientRepository, UserService userService) {
        this.patientRepository = patientRepository;
        this.userService = userService;
    }

    @PostMapping
    public Patient create(@RequestBody Patient patient) {
        return userService.createPatient(patient.getFederalCode(), patient.getCpf());
    }

    @GetMapping()
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Patient> getById(@PathVariable Integer id) {
        return patientRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Patient update(@RequestBody Patient newPatient, @PathVariable Integer id) {
        return patientRepository.findById(id)
                .map(patient -> {
                    patient.setCpf(newPatient.getCpf());
                    patient.setFederalCode(newPatient.getFederalCode());
                    patient.setDrugsClaimed(newPatient.getDrugsClaimed());
                    patient.setActive(newPatient.getActive());
                    patient.setLastEntry(newPatient.getLastEntry());
                    return patientRepository.save(patient);
                }).orElseGet(() -> patientRepository.save(newPatient));
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        patientRepository.deleteById(id);
    }
}
