# Online-Shopping-System-3

Proyek ini adalah implementasi sistem belanja online sederhana berbasis konsol menggunakan Java. Sistem ini dirancang untuk mendemonstrasikan konsep-konsep Pemrograman Berorientasi Objek (OOP) seperti Enkapsulasi, Pewarisan (Inheritance), Polimorfisme, dan Antarmuka (Interface).

## 🚀 Alur Program & Fitur Utama

Program ini mensimulasikan proses penambahan produk ke keranjang belanja dan menampilkan detail pembelian.

1.  **Inisialisasi Objek Produk**:
    * Program dimulai dari kelas `MainApp`.
    * Berbagai objek produk (`Electronics` dan `Clothing`) diinisialisasi dan ditambahkan ke `ProductManager` saat startup.

2.  **Konstruktor & Enkapsulasi**:
    * Setiap objek produk dibuat dengan memanggil konstruktor yang mengisi atribut seperti ID, nama, harga, dan kategori.
    * Semua atribut kunci bersifat `private` dan hanya dapat diakses atau dimodifikasi melalui metode `getter` dan `setter` yang sesuai, menjamin prinsip enkapsulasi.

3.  **Pewarisan (Inheritance)**:
    * Kelas `Electronics` dan `Clothing` adalah `subclass` dari kelas `Product` (kelas `abstract`).
    * Mereka mewarisi atribut dan perilaku umum dari `Product`.
    * **Electronics**: Memiliki atribut tambahan `Specification` yang diimplementasikan sebagai `inner class` untuk mengelola berat dan merek.
    * **Clothing**: Memiliki atribut tambahan `Size` yang menggunakan `Enum` (`XS`, `S`, `M`, `L`, `XL`), serta material dan warna.

4.  **Polimorfisme & Antarmuka (Interface)**:
    * Metode `getCategory()` adalah `abstract method` di `Product` yang di-override di setiap `subclass` untuk mengembalikan kategori spesifik produk.
    * Baik `Electronics` maupun `Clothing` mengimplementasikan antarmuka `Discountable`, yang mendefinisikan kontrak untuk produk yang bisa mendapatkan diskon (`getDiscountedPrice`).

5.  **Fungsionalitas Keranjang Belanja (`ShoppingCart`)**:
    * Kelas `ShoppingCart` bertanggung jawab untuk menyimpan item-item belanja. Setiap item di keranjang mencatat produk dan kuantitasnya.
    * Jika produk yang sama ditambahkan, kuantitasnya akan diperbarui.
    * Harga diskon (jika berlaku) dihitung berdasarkan persentase diskon yang diberikan.
    * Tanggal dan waktu pembuatan produk ditampilkan secara terpisah dan rapi.
    * Berat (`weight`) produk elektronik ditampilkan sebagai bagian dari detail spesifikasinya.

6.  **Manajemen Produk (`ProductManager`)**:
    * Mengelola daftar semua produk yang tersedia.
    * Menyediakan fungsionalitas untuk menambahkan, mencari (`findProductById`), dan menampilkan semua produk (`displayAllProducts`).
    * Mencegah penambahan produk dengan ID yang duplikat.

7.  **Manajemen Transaksi (`TransactionManager`)**:
    * Mencatat pembelian yang dilakukan oleh pelanggan.
    * Dapat menampilkan riwayat pembelian untuk pelanggan tertentu atau semua pelanggan.

8.  **Output ke Konsol**:
    * Program akan mencetak informasi semua item dalam keranjang belanja, detail produk, serta ringkasan total.
    * Semua harga (harga asli, harga setelah diskon, subtotal, total keseluruhan) diformat dengan benar dalam mata uang Rupiah (Rp) hingga dua digit desimal dan menggunakan pemisah ribuan.

## 📁 Struktur Berkas Proyek

Proyek ini terorganisir dalam beberapa berkas Java:

* `Product.java`: Kelas induk abstrak untuk semua jenis produk.
* `Electronics.java`: Subclass dari `Product` untuk produk elektronik, mencakup `Specification` sebagai inner class dan mengimplementasikan `Discountable`.
* `Clothing.java`: Subclass dari `Product` untuk produk pakaian, menggunakan `Size` (enum) dan mengimplementasikan `Discountable`.
* `Size.java`: Definisi `enum` untuk ukuran pakaian (`XS`, `S`, `M`, `L`, `XL`).
* `Discountable.java`: Antarmuka yang mendefinisikan kontrak untuk produk yang dapat diberi diskon.
* `ShoppingCart.java`: Kelas yang mengelola daftar item yang dibeli oleh pelanggan.
* `ProductManager.java`: Kelas untuk mengelola daftar produk yang tersedia.
* `TransactionManager.java`: Kelas untuk mencatat dan menampilkan riwayat pembelian pelanggan.
* `ProductNotFoundException.java`: Custom exception untuk menangani kasus produk tidak ditemukan.
* `MainApp.java`: Kelas utama yang menjalankan aplikasi, menginisialisasi produk, menangani input pengguna, dan menampilkan output.

## 📊 Contoh Output

Berikut adalah contoh interaksi dan output saat menjalankan program:
![image](https://github.com/user-attachments/assets/9e44f3f1-af75-4bdc-bf57-9f1eb12fadcb)
![image](https://github.com/user-attachments/assets/6b9f32b2-9191-47aa-a002-2b7088ac2a3e)
![image](https://github.com/user-attachments/assets/f93a5342-4dd6-4c79-8b2c-8e6b51b1e82c)
![image](https://github.com/user-attachments/assets/2e777679-8da3-490e-872c-0085bbaab3d1)

## 👥 Anggota Kelompok

* **Tiarasyani Junia Bahri** (51424335)
* **Naisya Putri Abdullah** (51424000)
* **Freya Inezra Pardosi** (50424474)
* **Aulia Tifani** (50424209)




