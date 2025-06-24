/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTSnadira2401082010;

/**
 *
 * @author LENOVO
 */
public class dinamis {

    
    public static void main(String[] args) {
       // Objek dari kelas kendaraan
        kendaraan umum = new kendaraan();
        umum.setJmlRoda(4);
        umum.setWarna("biru");
        System.out.println("Kendaraan Umum:");
        System.out.println("Jumlah Roda: " + umum.getJmlroda());
        System.out.println("Warna: " + umum.getwarna());
        System.out.println();

        // Objek dari kelas mobil
        mobil fortuner = new mobil();
        fortuner.setJmlRoda(4);
        fortuner.setWarna("hitam");
        fortuner.setBahanBakar("diesel");
        fortuner.setKapasitasMesin(2500);
        System.out.println("Mobil:");
        System.out.println("Jumlah Roda: " + fortuner.getJmlroda());
        System.out.println("Warna: " + fortuner.getwarna());
        System.out.println("Bahan Bakar: " + fortuner.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + fortuner.getKapasitasMesin() + " cc");
        System.out.println();

        // Objek dari kelas taksi
        taksi bluebird = new taksi();
        bluebird.setJmlRoda(4);
        bluebird.setWarna("biru muda");
        bluebird.settarifAwal(10000);
        bluebird.settarifperKm(5000);
        System.out.println("Taksi:");
        System.out.println("Jumlah Roda: " + bluebird.getJmlroda());
        System.out.println("Warna: " + bluebird.getwarna());
        System.out.println("Tarif Awal: Rp " + bluebird.gettarifAwal());
        System.out.println("Tarif Per KM: Rp " + bluebird.gettarifperKm());

    }
    
}
