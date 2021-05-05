package Absract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void add(Customer customer) {
		System.out.println("Veri tabanına kaydedildi : " + customer.getCustomerName());

	}

	public void update(Customer customer) {
		System.out.println("Bilgiler güncellendi !");
	}

	public void deleted(Customer customer) {
		System.out.println("Veri tabanından silindi : " + customer.getCustomerName());
	}

}
