package Concrete;

import Entities.Campaigns;
import Abstract.Sale;
import Entities.Games;
import Entities.Players;

public class SaleManager implements Sale{

	@Override
	public void sale(Players player, Games game, Campaigns campaign) {
		double price = game.getUnitPrice()-(game.getUnitPrice()*campaign.getDiscount()/100);
		System.out.println("A user named "+ player.getFirstName() +" bougth the game "+ game.getGameName()+ " by taking adventage of the "+ campaign.getCampaignName() +" campaign. After discount final price : "+ price +" $.");
		
	}

}
	