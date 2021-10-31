package Concrete;

import Abstract.Campaign;

public class CampaignManager implements Campaign{

	@Override
	public void campaingAdd(Campaign campaign) {
		System.out.println("Discount added");
		
	}

	@Override
	public void campaingDelete(Campaign campaign) {
		System.out.println("Discount deleted");
		
	}

	@Override
	public void campaingUpdate(Campaign campaign) {
		System.out.println("Discount updated");
	}

}
