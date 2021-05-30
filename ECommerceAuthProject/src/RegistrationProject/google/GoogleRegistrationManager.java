package RegistrationProject.google;

import RegistrationProject.entities.concretes.User;

// Register with google simulation
public class GoogleRegistrationManager {
    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " signed up successfully with GOOGLE!");
    }
}
