package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        this.width = Math.max(0, width); // Negatifse 0
        this.length = Math.max(0, length); // Negatifse 0
    }

    // Getter
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Alan hesaplama
    public double getArea() {
        return width * length;
    }
}