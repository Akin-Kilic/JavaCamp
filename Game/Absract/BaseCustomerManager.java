package Absract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void add(Customer customer) {
		System.out.println("Veri taban�na kaydedildi : " + customer.getCustomerName());

	}

	public void update(Customer customer) {
		System.out.println("Bilgiler g�ncellendi !");
	}

	public void deleted(Customer customer) {
		System.out.println("Veri taban�ndan silindi : " + customer.getCustomerName());
	}

}
