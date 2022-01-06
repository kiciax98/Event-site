package com.praca.inzynierka.registration;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final EmailValidator emailValidator;

    public RegistrationService(EmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }
        return "works";
    }
}
