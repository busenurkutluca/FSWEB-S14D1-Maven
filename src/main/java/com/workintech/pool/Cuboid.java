package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    // Constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
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