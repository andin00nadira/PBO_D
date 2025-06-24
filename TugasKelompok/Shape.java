/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKelompok;

/**
 *
 * @author LENOVO
 */
public class Shape {
    
    private String color = "red";
    private boolean filled = true;

    // Constructor default
    public Shape() {
    }

    // Constructor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter untuk color
    public String getColor() {
        return color;
    }

    // Setter untuk color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk filled
    public boolean isFilled() {
        return filled;
    }

    // Setter untuk filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Metode toString untuk representasi string objek Shape
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }
}


