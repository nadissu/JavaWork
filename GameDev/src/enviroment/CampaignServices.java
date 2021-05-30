package enviroment;

public interface CampaignServices {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	void getAll(Campaign[] campaigns);

}
