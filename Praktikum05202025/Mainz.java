/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum05202025;

/**
 *
 * @author LENOVO
 */
public class Mainz {
    public static void main(String[] args) {
        // Objek dari kelas laptop
        laptop laptopGaming = new laptop();
        laptopGaming.setMerek("ASUS");
        laptopGaming.setTahunProduksi(2023);
        laptopGaming.setGaransi(2);
        laptopGaming.setUkuranLayar(15);
        laptopGaming.setKapasitasRAM(16);

        // Objek dari kelas smartphone
        smartphone hpCanggih = new smartphone();
        hpCanggih.setMerek("Samsung");
        hpCanggih.setTahunProduksi(2024);
        hpCanggih.setGaransi(1);
        hpCanggih.setKapasitasBaterai(5000);
        hpCanggih.setJumlahKamera(3);

        // Objek dari kelas gaming
        gaming pcGaming = new gaming();
        pcGaming.setMerek("MSI");
        pcGaming.setTahunProduksi(2022);
        pcGaming.setGaransi(3);
        pcGaming.setKartuGrafis("NVIDIA RTX 4080");
        pcGaming.setRefreshRate(165);

        // Objek dari kelas smartwatch
        smartwatch jamTangan = new smartwatch();
        jamTangan.setMerek("Xiaomi");
        jamTangan.setTahunProduksi(2023);
        jamTangan.setGaransi(1);
        jamTangan.setUkuranLayar(2);
        jamTangan.setTahanAir(true);

        // Tampilkan informasi
        System.out.println("=== LAPTOP ===");
        System.out.println("Merek: " + laptopGaming.getMerek());
        System.out.println("Tahun Produksi: " + laptopGaming.getTahunProduksi());
        System.out.println("Garansi: " + laptopGaming.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + laptopGaming.getUkuranLayar() + " inci");
        System.out.println("RAM: " + laptopGaming.getKapasitasRAM() + " GB");

        System.out.println("\n=== SMARTPHONE ===");
        System.out.println("Merek: " + hpCanggih.getMerek());
        System.out.println("Tahun Produksi: " + hpCanggih.getTahunProduksi());
        System.out.println("Garansi: " + hpCanggih.getGaransi() + " tahun");
        System.out.println("Baterai: " + hpCanggih.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + hpCanggih.getJumlahKamera());

        System.out.println("\n=== GAMING ===");
        System.out.println("Merek: " + pcGaming.getMerek());
        System.out.println("Tahun Produksi: " + pcGaming.getTahunProduksi());
        System.out.println("Garansi: " + pcGaming.getGaransi() + " tahun");
        System.out.println("Kartu Grafis: " + pcGaming.getKartuGrafis());
        System.out.println("Refresh Rate: " + pcGaming.getRefreshRate() + " Hz");

        System.out.println("\n=== SMARTWATCH ===");
        System.out.println("Merek: " + jamTangan.getMerek());
        System.out.println("Tahun Produksi: " + jamTangan.getTahunProduksi());
        System.out.println("Garansi: " + jamTangan.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + jamTangan.getUkuranLayar() + " inci");
        System.out.println("Tahan Air: " + (jamTangan.isTahanAir() ? "Ya" : "Tidak"));
    }
}

    
    
    

