/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKelompok;

/**
 *
 * @author LENOVO
 */
public class Square extends Rectangle {
    // Constructor default
    public Square() {
        super(); // Memanggil constructor Rectangle
    }

    // Constructor dengan side (width dan length sama)
    public Square(double side) {
        super(side, side); // Memanggil constructor Rectangle dengan width=side, length=side
    }

    // Constructor dengan side, color, dan filled (dari Shape melalui Rectangle)
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Memanggil constructor Rectangle
    }

    // Getter untuk side (bisa menggunakan getWidth atau getLength)
    public double getSide() {
        return getWidth(); // Atau getLength()
    }

    // Setter untuk side (mengatur width dan length)
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }


    // Override metode toString dari Rectangle
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}