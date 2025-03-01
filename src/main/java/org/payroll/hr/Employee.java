package org.payroll.hr;


public abstract class Employee  {

    private String name;
    private final int EMPLOYEE_ID;
    private Address address;
    private double payRate;
    private static int nextID = 1000;
    protected static final double STARTING_PAY_RATE = 7.75;

    public Employee(String name) {
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
        EMPLOYEE_ID = getNextID();
    }



    public static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }



    @Override
    public String toString(){
        return "Employee ID - " + this.EMPLOYEE_ID + "\nName - " +this.name
                + "\n" + this.address.toString();
    }

}
