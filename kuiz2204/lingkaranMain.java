/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuiz2204;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class lingkaranMain {

    
    public static void main(String[] args) {
      lingkaran L= new lingkaran(10);
      
      System.out.println(L.toString());
      
      L.setR(5);
      
      System.out.println("setelah radus diubah: ");
      System.out.println(L.toString());
    }
    
}
