package Concrete;

import Abstract.Game;
import Entities.Games;
import Entities.Players;

public class GameManager implements Game {

	@Override
	public void save(Games game) {
	System.out.println("Game saved");
		
	}

	@Override
	public void delete(Games game) {
		System.out.println("Game deleted");
		
	}

	@Override
	public void update(Games game) {
		System.out.println("Game updated");		
	}

	@Override
	public void addToCart(Players player, Games game) {
			System.out.println(game.getGameName() + " game added to cart..");
	}

	@Override
	public void addFavourite(Players player, Games game) {
		System.out.println(game.getGameName() + " game added to favouritelist..");		
	}

}
