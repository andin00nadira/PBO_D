/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKelompok;

/**
 *
 * @author LENOVO
 */
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    // Constructor default
    public Rectangle() {
    }

    // Constructor dengan width dan length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor dengan width, length, color, dan filled (dari Shape)
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Memanggil constructor Shape
        this.width = width;
        this.length = length;
    }

    // Getter untuk width
    public double getWidth() {
        return width;
    }

    // Setter untuk width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter untuk length
    public double getLength() {
        return length;
    }

    // Setter untuk length
    public void setLength(double length) {
        this.length = length;
    }

    // Metode untuk menghitung luas persegi panjang
    public double getArea() {
        return width * length;
    }

    // Metode untuk menghitung keliling persegi panjang
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override metode toString dari Shape
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
