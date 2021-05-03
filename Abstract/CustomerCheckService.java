package GameBackend.Abstract;

import GameBackend.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
