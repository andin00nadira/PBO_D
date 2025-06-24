/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasKelompok;

/**
 *
 * @author LENOVO
 */
public class MainSoal1 {
    public static void main(String[] args) {
        System.out.println("--- Objek Shape ---");
        Shape s1 = new Shape(); // Membuat objek Shape default
        System.out.println(s1); // Memanggil toString()
        System.out.println("Color: " + s1.getColor() + ", Filled: " + s1.isFilled());

        Shape s2 = new Shape("blue", false); // Membuat objek Shape dengan parameter
        System.out.println(s2);
        System.out.println("Color: " + s2.getColor() + ", Filled: " + s2.isFilled());

        System.out.println("\n--- Objek Circle ---");
        Circle c1 = new Circle(); // Membuat objek Circle default
        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius() + ", Area: " + c1.getArea() + ", Perimeter: " + c1.getPerimeter());
        System.out.println("Color: " + c1.getColor() + ", Filled: " + c1.isFilled()); // Mengakses atribut dari Shape

        Circle c2 = new Circle(5.0, "green", false); // Circle dengan semua parameter
        System.out.println(c2);
        System.out.println("Radius: " + c2.getRadius() + ", Area: " + c2.getArea() + ", Perimeter: " + c2.getPerimeter());
        System.out.println("Color: " + c2.getColor() + ", Filled: " + c2.isFilled());

        System.out.println("\n--- Objek Rectangle ---");
        Rectangle r1 = new Rectangle(); // Rectangle default
        System.out.println(r1);
        System.out.println("Width: " + r1.getWidth() + ", Length: " + r1.getLength() + ", Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());
        System.out.println("Color: " + r1.getColor() + ", Filled: " + r1.isFilled());

        Rectangle r2 = new Rectangle(4.0, 6.0, "yellow", true); // Rectangle dengan semua parameter
        System.out.println(r2);
        System.out.println("Width: " + r2.getWidth() + ", Length: " + r2.getLength() + ", Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());
        System.out.println("Color: " + r2.getColor() + ", Filled: " + r2.isFilled());

        System.out.println("\n--- Objek Square ---");
        Square sq1 = new Square(); // Square default
        System.out.println(sq1);
        System.out.println("Side: " + sq1.getSide() + ", Area: " + sq1.getArea() + ", Perimeter: " + sq1.getPerimeter());
        System.out.println("Color: " + sq1.getColor() + ", Filled: " + sq1.isFilled());

        Square sq2 = new Square(7.0, "purple", false); // Square dengan semua parameter
        System.out.println(sq2);
        System.out.println("Side: " + sq2.getSide() + ", Area: " + sq2.getArea() + ", Perimeter: " + sq2.getPerimeter());
        System.out.println("Color: " + sq2.getColor() + ", Filled: " + sq2.isFilled());
    }
    
}
