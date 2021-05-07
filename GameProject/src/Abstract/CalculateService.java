package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CalculateService {
    double unitePriceWithCampagin(Game game, Campaign campaign);
}
