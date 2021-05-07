package Concretes;

import Abstract.CustomerCheckService;
import Abstract.GamerService;
import Entities.Gamer;


public class GamerManager implements GamerService {

    public GamerManager(){

    }

    private CustomerCheckService _customerCheckService;

    public GamerManager(CustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;
    }

    @Override
    public void signUp(Gamer gamer) {
        if(_customerCheckService.check(gamer)){
            System.out.println("Gamer " + gamer.getFirstName() + " verified successfully!");
            System.out.println("Gamer " + gamer.getFirstName() + " was successfully signed up!");
        }else{
            System.out.println("Verification failed!");
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " was successfully updated!");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " was successfully deleted!");
    }

}
