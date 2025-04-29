package com.workintech.cylinder;

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = Math.max(0, radius); // Negatifse 0
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Alan hesaplama
    public double getArea() {
        return radius * radius * Math.PI;
    }
}