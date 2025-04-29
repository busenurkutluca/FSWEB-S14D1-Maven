package com.workintech;

import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;
import com.workintech.pool.Cuboid;
import com.workintech.developers.*;

public class Main {
    public static void main(String[] args) {
        // Silindir Testi
        System.out.println("=== Silindir Testi ===");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        // Havuzun Alanı Testi
        System.out.println("\n=== Havuzun Alanı Testi ===");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        // Developer Company Testi
        System.out.println("\n=== Developer Company Testi ===");
        HRManager hrManager = new HRManager(1, "Alice", 5000, 3, 3, 3);
        JuniorDeveloper junior = new JuniorDeveloper(2, "Bob", 2000);
        MidDeveloper mid = new MidDeveloper(3, "Charlie", 3000);
        SeniorDeveloper senior = new SeniorDeveloper(4, "Dave", 4000);

        hrManager.work();
        junior.work();
        mid.work();
        senior.work();

        hrManager.addEmployee(0, junior);
        hrManager.addEmployee(0, new JuniorDeveloper(5, "Eve", 2000)); // Dolu index
        hrManager.addEmployee(3, junior); // Sınır dışı index
        hrManager.addEmployee(1, mid);
        hrManager.addEmployee(1, senior);
    }
}