/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSnadira2401082010;

/**
 *
 * @author LENOVO
 */
public class mobil extends kendaraan{
    private String bahanBakar;
    private int kapasitasMesin;
    
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    
    public String getBahanBakar(){
        return this.bahanBakar;
    }
    
    public void setKapasitasMesin(int kapsitasMesin){
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public int getKapasitasMesin(){
        return this.kapasitasMesin;
    }
    
    public static void main(String[] args) {
        mobil fortuner = new mobil();
        fortuner.setJmlRoda(4);
        fortuner.setWarna("black");
        fortuner.setBahanBakar("dexlite");
        fortuner.setKapasitasMesin(3000);
        
        System.out.println("setail mobil fortuner: ");
         System.out.println("jumlah Roda : " + fortuner.getJmlroda());
          System.out.println("warna: "+ fortuner.getwarna());
           System.out.println("bahan bakar: " + fortuner.getBahanBakar());
            System.out.println("kapasitas mesin: " + fortuner.getKapasitasMesin()+ "cc");
    }
    
}
