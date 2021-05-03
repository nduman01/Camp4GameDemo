import Entities.Campaign;
import Entities.Customer;
import concrete.CampaignManager;
import concrete.CustomerManager;
import concrete.GameManager;
import concrete.ValidationManager;

public class Main {

	public static void main(String[] args) {
		Customer nazim=new Customer(1, "Naz�m", "Duman", "12345678901", 1980);
		Customer ay�e=new Customer(2, "Ay�e", "May�e", "12345678901", 1990);
		
		CustomerManager customerManager=new CustomerManager(new ValidationManager());
		customerManager.add(nazim);
		customerManager.add(ay�e);
		
		Campaign campaign1=new Campaign(1, "Call of Duty Kampanyas� %30", "500 TL yerine sadece 350 TL");
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		
		
		GameManager gameManager=new GameManager();
		gameManager.gameSaleInfo(nazim, campaign1);
		
		
		
		
		
		
		

	}

}
