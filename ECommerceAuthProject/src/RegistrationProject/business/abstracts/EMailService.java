package RegistrationProject.business.abstracts;

import RegistrationProject.entities.concretes.User;

public interface EMailService {
    void sendMail(User user);
}
