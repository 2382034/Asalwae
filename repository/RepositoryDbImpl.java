package repository;

import entities.Customer;

public class RepositoryDbImpl extends RepositoryImpl {
    @Override
    public void saveCustomer(Customer customer) {
        super.saveCustomer(customer);
        // Simulate saving to database
        System.out.println("Customer saved to database.");
    }
}
