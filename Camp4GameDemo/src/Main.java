import Entities.Campaign;
import Entities.Customer;
import concrete.CampaignManager;
import concrete.CustomerManager;
import concrete.GameManager;
import concrete.ValidationManager;

public class Main {

	public static void main(String[] args) {
		Customer nazim=new Customer(1, "Nazım", "Duman", "12345678901", 1980);
		Customer ayşe=new Customer(2, "Ayşe", "Mayşe", "12345678901", 1990);
		
		CustomerManager customerManager=new CustomerManager(new ValidationManager());
		customerManager.add(nazim);
		customerManager.add(ayşe);
		
		Campaign campaign1=new Campaign(1, "Call of Duty Kampanyası %30", "500 TL yerine sadece 350 TL");
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		
		
		GameManager gameManager=new GameManager();
		gameManager.gameSaleInfo(nazim, campaign1);
		
		
		
		
		
		
		

	}

}
