package com.company;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerService{

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer){
        if (customerCheckService.checkIfRealPerson(customer)){
            System.out.println("Kaydedildi : "+ customer.getFirstName());
        }else{
            System.out.println("Geçerli bir kişi değil");
        }
    }
}
