package org.payroll.hr;

public class Contractor {

    private int hoursWorked;
    private double partsCost;
    private String name;



    @Override
    public String toString() {
        return"Name: " + this.name +"\nHours Worked: " + this.hoursWorked + "\nParts : " + this.partsCost;
    }

}