package RegistrationProject.business.concretes;

import RegistrationProject.business.abstracts.EMailService;
import RegistrationProject.entities.concretes.User;

public class EmailManager implements EMailService {
    @Override
    public void sendMail(User user) {
        System.out.println("Verification mail was sent to the " + user.geteMail() + " Please click the link in the mail to verify your account.");
    }
}
