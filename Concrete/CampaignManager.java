package GameBackend.Concrete;

import GameBackend.Abstract.CampaignService;
import GameBackend.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya sisteme eklendi: " + campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi: " + campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getName());		
	}
}
