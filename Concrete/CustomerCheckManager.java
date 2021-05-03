package GameBackend.Concrete;

import GameBackend.Abstract.CustomerCheckService;
import GameBackend.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
