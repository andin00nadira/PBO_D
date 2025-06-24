/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSnadira2401082010;

/**
 *
 * @author LENOVO
 */
public class taksi extends kendaraan {
    private int tarifAwal;
    private int tarifPerKm;
    
 public void settarifAwal(int tarifAwal){
     this.tarifAwal = tarifAwal;
 }
 public int gettarifAwal(){
     return this.tarifAwal;
 }
 public void settarifperKm(int tarifPerKm){
     this.tarifPerKm = tarifPerKm;
 }
 
 public int gettarifperKm(){
     return this.tarifPerKm;
 }
 
    public static void mian(String[] args){
        taksi bluebird = new taksi();
        bluebird.setJmlRoda(4);
        bluebird.setWarna("biru muda");
        bluebird.settarifAwal(10000);
        bluebird.settarifperKm(5000);
        
        System.out.println("Detail Taksi Bluebird:");
        System.out.println("Jumlah Roda: " + bluebird.getJmlroda());
        System.out.println("Warna: " + bluebird.getwarna());
        System.out.println("Tarif Awal: Rp " + bluebird.gettarifAwal());
        System.out.println("Tarif Per KM: Rp " + bluebird.gettarifperKm());
    }

    }
 

