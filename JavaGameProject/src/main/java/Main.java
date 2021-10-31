import Abstract.*;
import Adapters.*;
import Concrete.*;
import Entities.*;


public class Main {

	public static void main(String[] args) {
		BasePlayerManager playerManager= new MenPlayerManager(new MernisServiceAdapter());
		GameManager gameManager = new GameManager();
		SaleManager saleManager = new SaleManager();
		Campaigns campaign3 = new Campaigns(47,69.99,"GTA V",3,"X-MASS",70,3);
		
		Players player1 = new Players(1,"MEHMET","GÜVEN",1988,"56677325090");
		playerManager.save(player1);
		Players player2 = new Players(2,"Engin", "Demiroğ", 1985,"28861499108");
		playerManager.save(player2);
		
		Games game1= new Games(1,70,"FIFA");
		//Games game2= new Games(2,65,"NBA 2k21");
		Games game2= new Games(2,65,"GTA V");
		
		gameManager.addFavourite(player1, game1);
		gameManager.addToCart(player2, game2);
		saleManager.sale(player2, game1, campaign3 );
		
		campaign3.setDiscount(35);
		campaign3.setCampaignName("Black Friday");
		saleManager.sale(player1, game2, campaign3);
		
		
		
	}

}
