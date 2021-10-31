package Abstract;
import Entities.Games;
import Entities.Players;

public interface Game {
	void save(Games game);
	void delete(Games game);
	void update(Games game);
	void addToCart(Players player, Games game);
	void addFavourite(Players player, Games game);
}
