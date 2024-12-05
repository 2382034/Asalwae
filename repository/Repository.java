package repository;

import entities.Customer;

public interface Repository {
    void saveCustomer(Customer customer);
    Customer getCustomer();
    double calculateTotalPrice();
    void addPackagePrice(double price); // Tambahkan metode ini
}
