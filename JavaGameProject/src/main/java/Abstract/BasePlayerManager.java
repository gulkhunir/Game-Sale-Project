package Abstract;

import Entities.Players;

public class BasePlayerManager  implements Player{
	private PlayerCheckService playerCheckService;
	public BasePlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService=playerCheckService;
	}
	@Override
	public void save(Players player) {
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Player added  : " +player.getFirstName());
		}else {
			System.out.println("This is invalid person.");
		}
		
	}
	@Override
	public void update(Players player) {
		System.out.println("Player's informations updated");
		
	}
	@Override
	public void delete(Players player) {
		System.out.println("Player deleted...!");
		
	}



}
