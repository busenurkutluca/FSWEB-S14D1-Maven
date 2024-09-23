import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;

import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        //Görev 2

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());


        // Görev 3

        HRManager hrManager = new HRManager(1, "Alice", 5000);

        JuniorDeveloper junior = new JuniorDeveloper(2, "Bob", 3000);
        MidDeveloper mid = new MidDeveloper(3, "Charlie", 4000);
        SeniorDeveloper senior = new SeniorDeveloper(4, "David", 6000);

        // Çalışanların eklenmesi
        hrManager.addEmployee(junior);
        hrManager.addEmployee(mid);
        hrManager.addEmployee(senior);

        // Çalışanlar işleri
        junior.work();
        mid.work();
        senior.work();

        hrManager.work();
    }

    }
