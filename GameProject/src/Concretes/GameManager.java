package Concretes;

import Abstract.CalculateService;
import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " was added succesfully! Details -> Developer: " + game.getDeveloper() + ", Language : " + game.getLanguage());
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + " was updated succesfully!");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " was deleted succesfully!");
    }

}
