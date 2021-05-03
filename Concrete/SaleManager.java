package GameBackend.Concrete;

import GameBackend.Abstract.SaleService;
import GameBackend.Entities.Campaign;
import GameBackend.Entities.Customer;
import GameBackend.Entities.Game;

public class SaleManager implements SaleService {

	@Override
	public void Sell(Customer customer, Game game) {
		System.out.println(game.getName() + " oyunu " + customer.getFirstName() + " isimli oyuncuya " + game.getPrice()
				+ " fiyatýna satýldý.");
	}

	@Override
	public void Sell(Customer customer, Game game, Campaign campaign) {
		double newPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountPercentage() / 100);

		System.out.println(game.getName() + " oyunu " + customer.getFirstName() + " isimli oyuncuya " + "%"
				+ campaign.getDiscountPercentage() + " indirimle " + newPrice + " fiyatýna satýldý.");
	}

}
