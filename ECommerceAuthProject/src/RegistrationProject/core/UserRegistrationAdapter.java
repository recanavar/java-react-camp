package RegistrationProject.core;

import RegistrationProject.entities.concretes.User;
import RegistrationProject.google.GoogleRegistrationManager;

public class UserRegistrationAdapter implements UserRegistrationService{
    @Override
    public void add(User user) {
        GoogleRegistrationManager manager = new GoogleRegistrationManager();
        manager.add(user);
        System.out.println("Adapter added a user successfully.");
    }
}
