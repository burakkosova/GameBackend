package GameBackend.Abstract;

import GameBackend.Entities.*;

public interface SaleService {
	void Sell(Customer customer, Game game);
	void Sell(Customer customer, Game game, Campaign campaign);
}
