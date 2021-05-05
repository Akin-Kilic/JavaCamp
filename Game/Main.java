import Adapters.MernisServiceAdapters;
import Concrete.CustomerManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {
	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"Akýn","KILIÇ","64903021982",2000,200,null);
		
		Absract.BaseCustomerManager customerManager = new CustomerManager(new MernisServiceAdapters());
		customerManager.add(customer);

		Campaign blackFridayCampaign = new Campaign(1, "Black Friday Kampanyasý", 12);
		
		Game forest = new Game(1, "Forest", 65, 20, blackFridayCampaign);
		
		System.out.println(customer.getCustomerName()+" , "+blackFridayCampaign.getCampaignName()+" alýndý, "+forest.getName()+" oyununa % "+blackFridayCampaign.getCampaignPrice()+
				  " indirim yapýldý. Eski fiyatý: "+forest.getPrice()+", Ýndirim sonraki fiyatý: "+forest.getAfterCampaignPrice());

	}
}
