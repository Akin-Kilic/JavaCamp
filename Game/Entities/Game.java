package Entities;

public class Game {

	private int id;
	private String name;
	private double price;
	private int unitStock;
	private Campaign campaign;
	private double afterCampaignPrice;

	public Game(int id, String name, double price, int unitStock, Campaign campaign) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.unitStock = unitStock;
		this.campaign = campaign;
		System.out.println(this.name+" oyunu eklendi !");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitStock() {
		return unitStock;
	}

	public void setUnitStock(int unitStock) {
		this.unitStock = unitStock;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public double getAfterCampaignPrice() {
		return price - (price * campaign.getCampaignPrice() / 100);
	}

}
