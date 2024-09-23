package com.workintech.developers;


public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5]; // Varsayılan boyut
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HRManager starts managing employees.");
    }

    // Add JuniorDeveloper
    public void addEmployee(JuniorDeveloper junior) {
        addDeveloper(junior, juniorDevelopers);
    }

    // Add MidDeveloper
    public void addEmployee(MidDeveloper mid) {
        addDeveloper(mid, midDevelopers);
    }

    // Add SeniorDeveloper
    public void addEmployee(SeniorDeveloper senior) {
        addDeveloper(senior, seniorDevelopers);
    }

    // Generic method to add developers to the correct array
    private <T> void addDeveloper(T developer, T[] developers) {
        for (int i = 0; i < developers.length; i++) {
            if (developers[i] == null) {
                developers[i] = developer;
                System.out.println(developer.getClass().getSimpleName() + " added.");
                return;
            }
        }
        System.out.println("No available slot for " + developer.getClass().getSimpleName());
    }
}
