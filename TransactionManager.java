import java.util.*;
// import java.text.DecimalFormat; // Tidak perlu lagi jika df tidak digunakan secara langsung

public class TransactionManager {
    private Map<String, Set<Product>> customerPurchases;
    // private static final DecimalFormat df = new DecimalFormat("#,##0.00"); // <-- Baris ini dihapus karena tidak digunakan

    public TransactionManager() {
        this.customerPurchases = new HashMap<>();
    }

    public void addPurchase(String customerName, Product product) {
        // Jika customer belum ada, buat Set baru
        customerPurchases.computeIfAbsent(customerName, k -> new HashSet<>());

        // Tambahkan produk ke Set (otomatis mencegah duplikat)
        Set<Product> purchases = customerPurchases.get(customerName);
        if (purchases.add(product)) {
            System.out.println("Pembelian ditambahkan: " + customerName + " membeli " + product.getName());
        } else {
            System.out.println("Produk " + product.getName() + " sudah dibeli oleh " + customerName);
        }
    }

    public Set<Product> getCustomerPurchases(String customerName) {
        Set<Product> purchases = customerPurchases.get(customerName);
        return purchases != null ? new HashSet<>(purchases) : new HashSet<>();
    }

    public void displayCustomerPurchases(String customerName) {
        Set<Product> purchases = getCustomerPurchases(customerName);

        if (purchases.isEmpty()) {
            System.out.println("Tidak ada pembelian ditemukan untuk pelanggan: " + customerName);
            return;
        }

        System.out.println("\n=== PEMBELIAN UNTUK " + customerName.toUpperCase() + " ===");
        double total = 0.0;
        // Header tabel pembelian pelanggan
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-15s | %s\n", "ID", "Nama Produk", "Kategori", "Harga Final");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        for (Product product : purchases) {
            System.out.printf("%-5d | %-20s | %-15s | %s\n",
                              product.getId(), product.getName(), product.getCategory(), Product.formatRupiah(product.calculateFinalPrice()));
            total += product.calculateFinalPrice();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Jumlah Total Pembelian: " + Product.formatRupiah(total)); // Menggunakan formatRupiah dari kelas Product
        System.out.println("Total Item: " + purchases.size());
    }

    public void displayAllCustomerPurchases() {
        if (customerPurchases.isEmpty()) {
            System.out.println("Tidak ada pembelian tercatat.");
            return;
        }

        System.out.println("\n=== SEMUA PEMBELIAN PELANGGAN ===");
        for (String customerName : customerPurchases.keySet()) {
            displayCustomerPurchases(customerName);
            System.out.println();
        }
    }

    public Set<String> getAllCustomers() {
        return new HashSet<>(customerPurchases.keySet());
    }
}