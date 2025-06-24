/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum18032025;

/**
 *
 * @author LENOVO
 */
public class TESTPersegiPanjang {
     public static void main(String[] args) {
        System.out.println("Banyak objek awal = " + PersegiPajang.getJumlahObjek());
        //buat objek pertama
        PersegiPajang PP1 = new PersegiPajang();
        PP1.panjang = 5;
        PP1.lebar = 3;
        System.out.println("Banyak objek setelah PP1 = " + PersegiPajang.getJumlahObjek());
        System.out.println("Luas = " + PP1.panjang + " * " + PP1.lebar + " = " + PP1.getLuas());
        //buat objek kedua
        PersegiPajang PP2 = new PersegiPajang(15, 4);
        System.out.println("Banyak objek setelah PP2 = " + PersegiPajang.getJumlahObjek());
        System.out.println("Keliling = 2 * (" + PP2.panjang + " + " + PP2.lebar + ") = " + PP2.getKeliling());
    }
}
