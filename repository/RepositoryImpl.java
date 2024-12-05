package repository;

import entities.Customer;

public class RepositoryImpl implements Repository {
    private Customer customer;
    private double totalPrice = 0;

    @Override
    public void saveCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public double calculateTotalPrice() {
        return totalPrice;
    }

    public void addPackagePrice(double price) {
        this.totalPrice += price;
    }


}
