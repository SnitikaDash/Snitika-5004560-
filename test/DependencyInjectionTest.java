package test;

import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;
import service.CustomerService;


public class DependencyInjectionTest {
	public static void main(String[] args) {
       
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

       
        CustomerService customerService = new CustomerService(customerRepository);

       
        String customer = customerService.getCustomerById("1");
        System.out.println(customer);

        customer = customerService.getCustomerById("2");
        System.out.println(customer);
    }
}
