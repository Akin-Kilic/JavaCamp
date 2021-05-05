package Entities;

public class Campaign {
	private int campaignId;
	private String campaignName;
	private double campaignPrice;

	public Campaign(int campaignId, String campaignName, double campaignPrice) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		if (campaignPrice > 100) {
			this.campaignPrice = 100;
		} else {
			this.campaignPrice = campaignPrice;
		}
		
		System.out.println(this.campaignName + " eklendi !");
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

	public double getCampaignPrice() {
		
		return campaignPrice;
	}

	public void setCampaignPrice(double campaignPrice) {
		if (campaignPrice > 100) {
			this.campaignPrice = 100;
		} else {
			this.campaignPrice = campaignPrice;
		}

	}

}
