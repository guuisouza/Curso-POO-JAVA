package exercicioPolimorfismo.application;

import exercicioPolimorfismo.entities.Employee;
import exercicioPolimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Employee " + i + " data: " );
            System.out.print("Outsourced (y/n)? ");
            char isOutsourced = sc.next().charAt(0);

            if (isOutsourced == 'n'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            } else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(outsourcedEmployee);
            }
        }

        System.out.println();
        System.out.println("Payments: ");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }
}
