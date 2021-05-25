package chapter08.Homework05;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {
        this.setBalance(this.getBalance()-1-amount);
    }
}
