package org.payroll.hr;

public class HourlyEmployee{




   public HourlyEmployee(String name) {
       super(name);
   }

   public HourlyEmployee(String name, int hoursWorked) {

   }





    @Override
    public String toString() {
       return "\t\t\t" + "\n\t" + "Name: " + this.getName() +
               "\n\t" + "Hours \t " + this.hoursWorked +
               "\n\t" + "Total Days Payment $" + this.calculatePay();
    }
}
