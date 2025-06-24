/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuiz2204;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class kerucutMain {

    public static void main(String[] args) {
       
    
        kerucut kerucut1 = new kerucut(5, 10);

      
        System.out.println(kerucut1.toString()); 
        
        System.out.println("Volume Kerucut: " + kerucut1.getVolume()); 
        
        kerucut1.setTinggi(15);

        
        System.out.println("\nSetelah perubahan tinggi:");
        System.out.println(kerucut1.toString()); 
        System.out.println("Volume Kerucut setelah perubahan tinggi: " + kerucut1.getVolume()); 
    
}
}