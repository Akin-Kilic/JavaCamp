package com.company;

public abstract class BaseCustomerManager implements ICustomerService{
    public void save(Customer customer){
        System.out.println("Kaydedildi : "+ customer.getFirstName());
    }
}
