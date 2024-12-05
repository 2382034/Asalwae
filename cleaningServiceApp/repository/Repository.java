package cleaningServiceApp.repository;

import cleaningServiceApp.entities.Customer;

import java.util.ArrayList;

public interface Repository {
    void saveCustomer(Customer customer);
    ArrayList<Customer> getCustomer();
    double calculateTotalPrice();
    void addPackagePrice(double price); // Tambahkan metode ini
}
