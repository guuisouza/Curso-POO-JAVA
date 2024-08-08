package exemploUpcastingDowncasting.application;

import exemploUpcastingDowncasting.entities.Account;
import exemploUpcastingDowncasting.entities.BusinessAccount;
import exemploUpcastingDowncasting.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING -> pegar um obj do tipo bacc e atribui-lo para uma váriavel do tipo acc
        // não da erro pois uma bacc É uma acc
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING -> Converter um obj da superclasse para a subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // Um savings account NÃO É um business account
        //  BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Emprestimo");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
