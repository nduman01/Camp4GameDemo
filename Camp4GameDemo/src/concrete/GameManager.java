package concrete;

import Entities.Campaign;
import Entities.Customer;

public class GameManager {
	public void gameSaleInfo(Customer customer, Campaign campaign) {
		System.out.println(customer.getFirsName()+" adlý kullanýcý "
				+campaign.getCampaignName()+" kampanyasýna katýldý. ");
		System.out.println("Kampanya detayý: "+campaign.getCampaignDetail());
	}

}
