package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface GameService {
    void add(Game game);
    void update(Game game);
    void delete(Game game);
}
