package Concrete;

import Absract.BaseCustomerManager;
import Absract.CustomerCheckService;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;

	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.add(customer);
		} else {
			System.out.println("Geçerli kiþi deðil !");
		}

	}

	@Override
	public void update(Customer customer) {
		super.update(customer);

	}

	@Override
	public void delete(Customer customer) {
		
		super.deleted(customer);

	}

}
