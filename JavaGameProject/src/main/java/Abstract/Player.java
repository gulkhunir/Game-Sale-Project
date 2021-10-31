package Abstract;

import Entities.Players;

public interface Player {
	void save(Players player);
	void update(Players player);
	void delete(Players player);
}
