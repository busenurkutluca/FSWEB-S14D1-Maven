package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    // Constructor
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    // Work metodu (Override)
    @Override
    public void work() {
        System.out.println(getName() + " Junior Developer starts to coding simple tasks");
        setSalary(getSalary() + 200); // Maaş artışı
    }
}