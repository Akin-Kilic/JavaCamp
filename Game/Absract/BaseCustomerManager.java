package Absract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void add(Customer customer) {
		System.out.println("Veri tabanýna kaydedildi : " + customer.getCustomerName());

	}

	public void update(Customer customer) {
		System.out.println("Bilgiler güncellendi !");
	}

	public void deleted(Customer customer) {
		System.out.println("Veri tabanýndan silindi : " + customer.getCustomerName());
	}

}
