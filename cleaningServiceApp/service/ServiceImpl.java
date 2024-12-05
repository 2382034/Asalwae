package cleaningServiceApp.service;

import cleaningServiceApp.entities.Customer;
import cleaningServiceApp.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ServiceImpl implements Service {
    private Repository repository;
    private double deliveryFee; // Deklarasikan deliveryFee di level kelas

    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void inputCustomerData(String name, String address, String phone) {
        Customer customer = new Customer(name, address, phone);
        repository.saveCustomer(customer);
    }

    @Override
    public void addPackage(int packageChoice, int quantity) {
        double price = 0;
        switch (packageChoice) {
            case 1 -> price = 100000;
            case 2 -> price = 200000;
            case 3 -> price = 50000;
        }
        repository.addPackagePrice(price * quantity); // Memastikan metode ini ada di interface
    }

    @Override
    public double getTotalPrice() {
        return repository.calculateTotalPrice();
    }

    @Override
    public ArrayList<Customer> getCustomerDetails() {
        return repository.getCustomer();
    }

    @Override
    public void calculateDeliveryFee(int distance) {
        this.deliveryFee = distance * 5000; // Hitung ongkos kirim berdasarkan jarak
        repository.addPackagePrice(deliveryFee); // Tambahkan ke total harga
        System.out.println("Ongkos antar: Rp " + deliveryFee);
    }

    // Getter untuk deliveryFee jika diperlukan
    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void showOrderDetails() {
        ArrayList<Customer> customerList = getCustomerDetails();
        System.out.println("===== Detail Pesanan =====");

        System.out.println("Nama\tAlamat\tNoHp");
        for (Customer customer : customerList){
            System.out.println(customer.getName() + "\t" + customer.getAddress()+ "\t" + customer.getPhone());
        }

        System.out.println("Ongkos Antar Anda: Rp " + deliveryFee);
        System.out.println("Total Pembayaran Anda: Rp " + getTotalPrice());
    }

}
