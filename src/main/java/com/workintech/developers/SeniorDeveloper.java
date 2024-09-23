package com.workintech.developers;



public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 500); // Senior developers receive a raise of 500
        System.out.println("Senior Developer is working. New salary: " + getSalary());
    }
}
