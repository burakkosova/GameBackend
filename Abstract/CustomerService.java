package GameBackend.Abstract;

import GameBackend.Entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
