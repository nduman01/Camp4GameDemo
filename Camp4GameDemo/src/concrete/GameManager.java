package concrete;

import Entities.Campaign;
import Entities.Customer;

public class GameManager {
	public void gameSaleInfo(Customer customer, Campaign campaign) {
		System.out.println(customer.getFirsName()+" adl� kullan�c� "
				+campaign.getCampaignName()+" kampanyas�na kat�ld�. ");
		System.out.println("Kampanya detay�: "+campaign.getCampaignDetail());
	}

}
