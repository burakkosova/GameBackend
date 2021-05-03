package GameBackend;

import java.time.LocalDate;

import GameBackend.Concrete.SaleManager;
import GameBackend.Entities.Campaign;
import GameBackend.Entities.Customer;
import GameBackend.Entities.Game;

public class Main {

	public static void main(String[] args) {
		SaleManager saleManager = new SaleManager();
		saleManager.Sell(new Customer(1,"Burak","Kosova",LocalDate.of(1999, 1, 26),"123456789"), new Game(1,"GTA V",230));
		saleManager.Sell(new Customer(1,"Burak","Kosova",LocalDate.of(1999, 1, 26),"123456789"), new Game(1,"GTA V",230),
				new Campaign(1,"Black Friday",15));
	}

}
