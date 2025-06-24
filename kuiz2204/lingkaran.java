/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuiz2204;

/**
 *
 * @author LENOVO
 */
public class lingkaran {
    private double r;
    
    public lingkaran(){
        
    }
    public lingkaran (double r){
        this.r = r;
     
    }
 
    public void setR(double r){
        this.r = r;
    }
   
    
    public double getR(){
        return r;
    }
    public double getDiameter(){
        return 2 * r;
    }
    public double getKeliling(){
        return 2 * Math.PI * r;
    }
    public double getLuas(){
        return Math.PI * r * r;
        
    }
    
    public String toString(){
        return "Lingkaran dengan jari jari = "+r+
                ", diameter = "+getDiameter()+
                ",keliling = " +getKeliling()+
                ",luas = "  + getLuas();
    }
    public double radius;
}


