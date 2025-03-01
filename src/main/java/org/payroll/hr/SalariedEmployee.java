package org.payroll.hr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SalariedEmployee extends Employee{



    public SalariedEmployee(String name) {
        super(name);
    }

    public SalariedEmployee(String name, double salary) {

    }

  

    @Override
    public String toString() {
        return String.format("\n\tName: " + this.getName() +
                "\n\tGross Salary $" + this.salary +
                "\n\tNet Salary $%.2f", calculatePay());

    }

}
