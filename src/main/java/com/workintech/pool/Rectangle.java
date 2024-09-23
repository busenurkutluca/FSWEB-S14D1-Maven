package com.workintech.pool;

public class Rectangle {
    private double width;
    private double lenght;


    public Rectangle(double width, double lenght) {
        this.width = width < 0 ? 0 : width;
        this.lenght = lenght < 0 ? 0 : lenght;
    }

    public double getWidth() {
        return width;
    }



    public double getArea() {
        return this.width * this.lenght;
    }

    public double getLength() {
        return lenght;
    }
}



