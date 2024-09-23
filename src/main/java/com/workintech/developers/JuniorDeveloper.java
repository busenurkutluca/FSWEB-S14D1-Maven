package com.workintech.developers;


public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 100); // Junior developers receive a raise of 100
        System.out.println("Junior Developer is working. New salary: " + getSalary());
    }
}
