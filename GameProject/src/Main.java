import Adapters.MernisServiceAdapter;
import Concretes.CampaingManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

    public static void main(String[] args) {
        Game game1 = new Game(1,"Call of Duty","Activision",250,"Experience the thrill of Call of Duty on the go","English");
        Game game2 = new Game(2,"Counter Strike:GO","Valve",50,"Counter-Strike: Global Offensive (CS:GO) expands upon the team-based first person shooter gameplay the original Counter-Strike pioneered when it launched in 1999","English");

        Gamer gamer1 = new Gamer(1,"Ridvan","C","1234567890",1996);

        Campaign campaign1 = new Campaign(1,"JAVACAMP",20);

        CampaingManager campaingManager = new CampaingManager();
        campaingManager.add(campaign1);

        GameManager gameManager = new GameManager();
        gameManager.add(game1);
        gameManager.add(game2);

        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        gamerManager.signUp(gamer1);

        SalesManager salesManager = new SalesManager();
        salesManager.sell(game1,gamer1,campaign1);

    }
}
