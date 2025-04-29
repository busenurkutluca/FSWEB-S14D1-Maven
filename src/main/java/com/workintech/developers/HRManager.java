package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    // Constructor
    public HRManager(int id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    // Work metodu (Override)
    @Override
    public void work() {
        System.out.println(getName() + " HR Manager starts to managing HR operations");
        setSalary(getSalary() + 500); // Maaş artışı
    }

    // addEmployee metotları (Overloading)
    public void addEmployee(int index, JuniorDeveloper developer) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Error: Index " + index + " is out of bounds for JuniorDeveloper");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("Error: Index " + index + " is already occupied for JuniorDeveloper");
            return;
        }
        juniorDevelopers[index] = developer;
        System.out.println("JuniorDeveloper " + developer.getName() + " added at index " + index);
    }

    public void addEmployee(int index, MidDeveloper developer) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Error: Index " + index + " is out of bounds for MidDeveloper");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("Error: Index " + index + " is already occupied for MidDeveloper");
            return;
        }
        midDevelopers[index] = developer;
        System.out.println("MidDeveloper " + developer.getName() + " added at index " + index);
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Error: Index " + index + " is out of bounds for SeniorDeveloper");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("Error: Index " + index + " is already occupied for SeniorDeveloper");
            return;
        }
        seniorDevelopers[index] = developer;
        System.out.println("SeniorDeveloper " + developer.getName() + " added at index " + index);
    }
}