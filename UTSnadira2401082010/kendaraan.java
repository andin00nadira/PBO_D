/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSnadira2401082010;

/**
 *
 * @author LENOVO
 */
public class kendaraan {
    private int jmlRoda;
    private String warna;
    
    public void setJmlRoda(int jmlRoda){
        this.jmlRoda = jmlRoda;
    }
    public int getJmlroda(){
        return this.jmlRoda;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getwarna(){
        return this.warna;
    }
    
    public static void main (String[] args ){
        
         kendaraan mobil = new kendaraan ();
         mobil.setJmlRoda(4);
         mobil.setWarna("merah");
         
         System.out.println("jumlah roda mobil : " + mobil.getJmlroda());
         System.out.println("warna mobil : "+ mobil.getwarna());
         
         kendaraan sepeda = new kendaraan ();
         sepeda.setJmlRoda(2);
         sepeda.setWarna("biru");
         
         System.out.println("jumlah roda sepeda : "+ sepeda.getJmlroda());
         System.out.println("warna sepeda: "+ sepeda.getwarna());
         
         
    }
    
}
