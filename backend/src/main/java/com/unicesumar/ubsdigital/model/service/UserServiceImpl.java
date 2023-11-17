package com.unicesumar.ubsdigital.model.service;

import com.unicesumar.ubsdigital.model.domain.Patient;
import com.unicesumar.ubsdigital.model.domain.User;
import com.unicesumar.ubsdigital.model.repository.PatientRepository;
import com.unicesumar.ubsdigital.model.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final PatientRepository patientRepository;
    private final UserRepository userRepository;

    public UserServiceImpl(PatientRepository patientRepository, UserRepository userRepository) {
        this.patientRepository = patientRepository;
        this.userRepository = userRepository;
    }

    private User createUser(String cpf) {
        return userRepository.save(new User(cpf));
    }

    public Patient createPatient(Integer federalCode, String cpf) {
        var user = createUser(cpf);
        var patient = new Patient(user.getId(), federalCode);
        return patientRepository.save(patient);
    }
}
