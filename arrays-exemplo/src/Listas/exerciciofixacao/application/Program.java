package Listas.exerciciofixacao.application;

import Listas.exerciciofixacao.entities.Employee;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while (hasId(employeeList, id)) {
                System.out.print("Id alredy taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer temporaryId = sc.nextInt();
        Employee employeeBonusSalary = employeeList.stream().filter(x -> Objects.equals(x.getId(), temporaryId)).findFirst().orElse(null);

        if (employeeBonusSalary == null) {
            System.out.println("This id does not exist!");
            System.out.println();
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employeeBonusSalary.increaseSalary(percentage);
            System.out.println();
        }

        System.out.println("List of employees: ");
        for (Employee x : employeeList) {
            System.out.println(x);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employeeId = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employeeId != null;
    }
}
