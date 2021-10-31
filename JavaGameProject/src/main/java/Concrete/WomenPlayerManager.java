package Concrete;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Entities.Players;

public class WomenPlayerManager extends BasePlayerManager {

	public WomenPlayerManager(PlayerCheckService playerCheckService) {
		super(playerCheckService);
		
	}

	@Override
	public void save(Players player) {
		// TODO Auto-generated method stub
		super.save(player);
	}

	@Override
	public void update(Players player) {
		// TODO Auto-generated method stub
		super.update(player);
	}

	@Override
	public void delete(Players player) {
		// TODO Auto-generated method stub
		super.delete(player);
	}

	

}
