/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKelompok;

/**
 *
 * @author LENOVO
 */
public class Circle extends Shape {
    private double radius = 1.0;

    // Constructor default
    public Circle() {
    }

    // Constructor dengan radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor dengan radius, color, dan filled (dari Shape)
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Memanggil constructor Shape
        this.radius = radius;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode untuk menghitung luas lingkaran
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Metode untuk menghitung keliling lingkaran
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override metode toString dari Shape
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}

