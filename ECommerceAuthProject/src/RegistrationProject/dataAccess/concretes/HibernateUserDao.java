package RegistrationProject.dataAccess.concretes;

import RegistrationProject.dataAccess.abstracts.UserDao;
import RegistrationProject.entities.concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " added to the DB successfully with Hibernate!");
    }

    @Override
    public void update(User user) {
        System.out.println("User" + user.getFirstName() + " " + user.getLastName() + " updated successfully with Hibernate!");
    }

    @Override
    public void delete(User user) {
        System.out.println("User" + user.getFirstName() + " " + user.getLastName() + " deleted from DB successfully with Hibernate!");
    }
}
