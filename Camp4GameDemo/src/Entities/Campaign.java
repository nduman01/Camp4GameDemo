package Entities;

public class Campaign {
	int campaignId;
	String campaignName;
	String campaignDetail;
	public Campaign(int campaignId, String campaignName, String campaignDetail) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDetail = campaignDetail;
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
	public String getCampaignDetail() {
		return campaignDetail;
	}
	public void setCampaignDetail(String campaignDetail) {
		this.campaignDetail = campaignDetail;
	}
	
	

}
