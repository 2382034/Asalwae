package cleaningServiceApp.service;

import cleaningServiceApp.entities.Customer;

import java.util.ArrayList;

public interface Service {
    void inputCustomerData(String name, String address, String phone);
    void addPackage(int packageChoice, int quantity);
    double getTotalPrice();
    ArrayList<Customer> getCustomerDetails();
    void calculateDeliveryFee(int distance); // Tambahkan deklarasi metode
    void showOrderDetails();
}
