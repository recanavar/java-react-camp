package RegistrationProject.dataAccess.abstracts;

import RegistrationProject.entities.concretes.User;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);

}
