package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = Math.max(0, height); // Negatifse 0
    }

    // Getter
    public double getHeight() {
        return height;
    }

    // Hacim hesaplama
    public double getVolume() {
        return getArea() * height;
    }
}