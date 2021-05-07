package Concretes;


import Abstract.CalculateService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements CalculateService {

    @Override
    public double unitePriceWithCampagin(Game game, Campaign campaign) {
        return game.getUnitPrice() - (game.getUnitPrice()*campaign.getDiscount()/100);
    }

    public void sell(Game game, Gamer gamer, Campaign campaign){
        System.out.println("Gamer " + gamer.getFirstName() + ", bought the " + game.getName() + " " + unitePriceWithCampagin(game,campaign) + " dolar with " + campaign.getDiscount() + " percent discount.");
    }

}
