package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    // Constructor
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    // Work metodu (Override)
    @Override
    public void work() {
        System.out.println(getName() + " Senior Developer starts to coding complex tasks");
        setSalary(getSalary() + 500); // Maaş artışı
    }
}