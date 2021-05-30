package RegistrationProject.business.abstracts;

import RegistrationProject.entities.concretes.User;

import java.util.List;

public interface RegistrationService {
    void addWithService(User user);
    void loginWithService(String email, String password);
}
