package RegistrationProject.business.concretes;

import RegistrationProject.business.abstracts.RegistrationService;
import RegistrationProject.business.abstracts.UserService;
import RegistrationProject.core.UserRegistrationAdapter;
import RegistrationProject.dataAccess.abstracts.UserDao;
import RegistrationProject.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService, RegistrationService {

    private UserDao userDao;
    private UserRegistrationAdapter userRegistrationAdapter;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserManager(UserRegistrationAdapter userRegistrationAdapter) {
        this.userRegistrationAdapter = userRegistrationAdapter;
    }

    @Override
    public void add(User user) {
        if(isValidName(user)){
            if(isValidMail(user)){
                if(isValidPassword(user)){
                    System.out.println("User signup form submitted. Please verify your e-mail.");
                    verify(user);
                    this.userDao.add(user);
                }else{
                    System.out.println("Your password is not valid. Please fill the form again.");
                }
            }else{
                System.out.println("Your e-mail is not valid or already registered. Please fill the form again.");
            }
        }else{
            System.out.println("Your name is not valid. Please fill the form again.");
        }
    }

    @Override
    public void addWithService(User user) {
        this.userRegistrationAdapter.add(user);
    }

    @Override
    public void loginWithService(String email, String password) {
        // can be implemented used service like google or twitter.
    }

    @Override
    public void verify(User user) {
        System.out.println(user.geteMail() + " verified successfully. You can use your account.");
    }

    @Override
    public void login(String email, String password) {
        // These boolean and for loop were just for simulation.
        boolean control = false;
        List <User> users = getUsers();
        for(User u : users){
            if(u.geteMail() == email && u.getPassword() == password){
                control = true;
            }
        }
        if(control){
            System.out.println(email + " logged in successfully!");
        }else{
            System.out.println("E-mail or password is wrong. Please try again.");
        }
    }

    @Override
    public boolean isValidMail(User user) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.geteMail());
        List <User> users = getUsers();

        // This boolean and for loop were just simulation for fetching user from database.
        boolean control = false;
        for(User u : users){
            if(u.geteMail() == user.geteMail()){
                control = true;
            }
        }

        if(matcher.matches() && control){ // Email was used or not before, and was valid.
            control = false;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isValidPassword(User user) {
        if(user.getPassword().length() >= 6){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isValidName(User user) {
        if(user.getFirstName().length() >= 2 && user.getLastName().length() >= 2){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<User> getUsers() {
        // Normally users should be fetched from DB. But here, to make the simulation for isValidMail method, I created a example list.
        List <User> list = new ArrayList<>();
        list.add(new User(1,"Ahmet","Can","test@gmail.com","pass1234"));
        list.add(new User(2,"Deniz","Yılmaz","test2@gmail.com","pass12345"));
        list.add(new User(1,"Mehmet","Köroğlu","test3@gmail.com","Pwd1234"));
        return list;
    }

}
