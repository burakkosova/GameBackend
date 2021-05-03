package GameBackend.Concrete;

import GameBackend.Abstract.CustomerCheckService;
import GameBackend.Abstract.CustomerService;
import GameBackend.Entities.Customer;

public class CustomerManager implements CustomerService{

	CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer))
			System.out.println("Müþteri sisteme eklendi: " + customer.getFirstName());
		else	
			System.err.println("Kiþi bilgileri doðrulanamadý!");
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi: " + customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: " + customer.getFirstName());
	}

}
