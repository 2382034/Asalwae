package service;

import entities.Customer;

public interface Service {
    void inputCustomerData(String name, String address, String phone);
    void addPackage(int packageChoice, int quantity);
    double getTotalPrice();
    Customer getCustomerDetails();
    void calculateDeliveryFee(int distance); // Tambahkan deklarasi metode
    void showOrderDetails();
}
