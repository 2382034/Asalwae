package view;

import service.Service;

import java.util.Scanner;

public class TerminalViewImpl implements TerminalView {
    private Service service;
    private Scanner scanner = new Scanner(System.in);

    public TerminalViewImpl(Service service) {
        this.service = service;
    }

    @Override
    public void displayMenu() {
        System.out.println("============ Cleaning Service UNAI ============");
        System.out.println("1. Tampilkan paketan bersih-bersih dan harga");
        System.out.println("2. Pilih Paketan dan jumlah pesanan");
        System.out.println("3. Input data pembeli (nama, alamat, nomor telepon)");
        System.out.println("4. Hitung total harga pesanan");
        System.out.println("5. Sistem antar (hitung ongkos jarak)");
        System.out.println("6. Konfirmasi pesanan");
        System.out.println("7. Tampilkan detail pesanan");
        System.out.println("8. Keluar");
        System.out.println("===============================================");

    }

    @Override
    public void handleInput() {
        while (true) {
            displayMenu();
            System.out.print("Pilih Opsi Menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("=== Daftar Paketan ===");
                    System.out.println("1. Pembersihan Halaman - Rp 100,000");
                    System.out.println("2. Pembersihan Rumah - Rp 200,000");
                    System.out.println("3. Pembersihan Kamar - Rp 50,000");
                }
                case 2 -> {
                    System.out.print("Pilih Paketan Bersih-Bersih (1-3): ");
                    int packageChoice = scanner.nextInt();
                    System.out.print("Jumlah yang ingin dipesan: ");
                    int quantity = scanner.nextInt();
                    service.addPackage(packageChoice, quantity);
                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    service.inputCustomerData(name, address, phone);
                }

                case 4 -> System.out.println("Total Price: " + service.getTotalPrice());

                case 5 -> {
                    System.out.print("Masukkan jarak ke alamat (km): ");
                    int distance = scanner.nextInt();
                    service.calculateDeliveryFee(distance); // Panggil service untuk menghitung ongkir
                    System.out.println("Ongkos kirim berhasil dihitung.");
                }
                case 6 ->{
                    System.out.println("Pesanan telah dikonfirmasi.");
                }
                case 7 ->{
                    service.showOrderDetails();
                }
                case 8 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
