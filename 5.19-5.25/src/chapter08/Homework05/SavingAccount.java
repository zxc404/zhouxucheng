package chapter08.Homework05;

public class SavingAccount extends BankAccount{

    private int count=3;
    private double rate=0.01;

    @Override
    public void deposit(double amount) {
        if(count>0){
            super.deposit(amount);
            count--;
        }else{
            super.deposit(amount-1);

        }
    }

    @Override
    public void withdraw(double amount) {
        if(count>0){
            super.withdraw(amount);
            count--;
        }else{
            super.withdraw(amount+1);

        }
    }

    public void earn(){
        count=3;
        super.deposit(getBalance()*rate);
    }

    public SavingAccount(double balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
