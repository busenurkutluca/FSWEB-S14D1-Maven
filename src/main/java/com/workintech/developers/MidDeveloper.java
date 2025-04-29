package com.workintech.developers;

public class MidDeveloper extends Employee {
    // Constructor
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    // Work metodu (Override)
    @Override
    public void work() {
        System.out.println(getName() + " Mid Developer starts to coding intermediate tasks");
        setSalary(getSalary() + 350); // Maaş artışı
    }
}