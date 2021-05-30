import RegistrationProject.business.concretes.EmailManager;
import RegistrationProject.business.concretes.UserManager;
import RegistrationProject.core.UserRegistrationAdapter;
import RegistrationProject.dataAccess.concretes.HibernateUserDao;
import RegistrationProject.entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        System.out.println("======== OUR OWN USER ADD IMPLEMENTATION ========");
        User user1 = new User(1,"Ahmet","Can","test@gmail.com","pass1234");
        UserManager userManager = new UserManager(new HibernateUserDao());
        userManager.add(user1);

        System.out.println("======== USER ADD IMPLEMENTATION WITH GOOGLE ========");
        User user2 = new User(2,"Deniz","Yılmaz","test2@gmail.com","pass12345");
        UserManager userManager2 = new UserManager(new UserRegistrationAdapter());
        userManager2.addWithService(user2);

        System.out.println("======== E-MAIL VERIFICATION ========");
        EmailManager emailManager = new EmailManager();
        emailManager.sendMail(user1);
        userManager.verify(user1);

        System.out.println("======== LOGIN ========");
        userManager.login("test@gmail.com","pass1234");
    }
}
