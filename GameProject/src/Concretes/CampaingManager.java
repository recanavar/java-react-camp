package Concretes;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaingManager implements CampaignService {

    @Override
    public void add(Campaign campaign) {
        if(isValid(campaign)){
            System.out.println("Campaign with code '" + campaign.getCode() + "' and %" + campaign.getDiscount() +" discount added successfully!");
        }else{
            System.out.println("Campaign code not valid!");
        }
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign updated successfully!");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Campaign deleted successfully!");
    }


    @Override
    public boolean isValid(Campaign campaign) {
        if(campaign.getCode().length() > 1){
            return true;
        }else{
            return false;
        }

    }
}
