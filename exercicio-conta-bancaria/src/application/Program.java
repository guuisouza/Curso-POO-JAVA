package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n): ");
        double balance = 0.0;
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter an initial deposit value: ");
            balance = sc.nextDouble();
            System.out.println();
        } else {
            sc.nextLine();
        }

        Account account = new Account(number, holder, balance);

        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);
    }
}
