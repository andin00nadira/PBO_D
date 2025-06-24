package praktikum11032025;

import java.util.Scanner;

public class KendaraanMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String jenis, merk, warna;
        int tahun, harga, kecepatan;

        System.out.print("Masukkan jenis kendaraan = ");
        jenis = in.nextLine();
        System.out.print("Masukkan merk = ");
        merk = in.nextLine();
        System.out.print("Masukkan tahun = ");
        tahun = in.nextInt();
        in.nextLine(); // Membersihkan newline
        System.out.print("Masukkan warna = ");
        warna = in.nextLine();
        System.out.print("Harga sewa kendaraan = ");
        harga = in.nextInt();
        System.out.print("Kecepatan kendaraan = ");
        kecepatan = in.nextInt();
        
        Kendaraan kend = new Kendaraan(jenis, merk, tahun, warna);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.CekKecepatan(kecepatan);
    }
}
