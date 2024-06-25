package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    /* Methods */

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (grossSalary * (percentage / 100));
        System.out.println("Updated data: " + name + ", $ " + String.format("%.2f", grossSalary));
    }
}
