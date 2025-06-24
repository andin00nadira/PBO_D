/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuiz2204;

/**
 *
 * @author LENOVO
 */
public class kerucut extends lingkaran{
    private double tinggi;
    
    public kerucut(){
        super();
        this.tinggi = 0;
    }
    public kerucut(double r, double t){
        super(r);
        this.tinggi =t;
        
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getVolume(){
         return(1.0/3.0) * getLuas()* this.tinggi;
    }
    
    
   }