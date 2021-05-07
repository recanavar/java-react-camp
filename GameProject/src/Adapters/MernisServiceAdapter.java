package Adapters;

import Abstract.CustomerCheckService;
import Entities.Gamer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean check(Gamer gamer) {
        return true;
    }
}
