package entities;

// Exercicio corrigido
public class AccountReview {
    public final double TAX = 5.0;

    private int number;
    private String holder;
    private double balance;

    public AccountReview(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public AccountReview(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount){
        balance = balance - amount - TAX;
    }

    @Override
    public String toString() {
        return "Account" +
                " number: " + number +
                ", holder: " + holder  +
                ", balance: $ " + String.format("%.2f", getBalance());
    }
}
