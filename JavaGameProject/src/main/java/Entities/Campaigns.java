package Entities;

public class Campaigns extends Games {

	private int campaignId;
	private String campaignName;
	private double discount;
	private int campaignDuration;
	
	public Campaigns() {
		// TODO Auto-generated constructor stub
	}

	public Campaigns(int gameId, double unitPrice, String gameName, int campaignId, String campaignName, double discount,
			int campaignDuration) {
		super(gameId, unitPrice, gameName);
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
		this.campaignDuration = campaignDuration;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getCampaignDuration() {
		return campaignDuration;
	}

	public void setCampaignDuration(int campaignDuration) {
		this.campaignDuration = campaignDuration;
	}

}
