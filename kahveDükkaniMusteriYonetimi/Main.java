package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
	    customerManager.save(new Customer(1,"Akın","KILIÇ",new Date(2000,12,8),"64903021982"));
    }
}
