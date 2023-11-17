package com.unicesumar.ubsdigital.model.service;

import com.unicesumar.ubsdigital.model.domain.Patient;

public interface UserService {
    Patient createPatient(Integer federalCode, String cpf);
}
