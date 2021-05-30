package RegistrationProject.business.abstracts;

import RegistrationProject.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void verify(User user);
    void login(String email, String password);
    boolean isValidMail(User user);
    boolean isValidPassword(User user);
    boolean isValidName(User user);
    List <User> getUsers();
}
