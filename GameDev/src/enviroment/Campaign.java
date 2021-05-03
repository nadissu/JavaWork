package enviroment;

public class Campaign implements EntityBase{
	private int campaignid;
	private String campaignName;
	private double discount; 
	
	
	public Campaign() {
		
	}

	public Campaign(int campaignid, String campaignName, double discount) {
		super();
		this.campaignid = campaignid;
		this.campaignName = campaignName;
		this.discount = discount;
	}

	public int getCampaignid() {
		return campaignid;
	}

	public void setCampaignid(int campaignid) {
		this.campaignid = campaignid;
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
	

}
