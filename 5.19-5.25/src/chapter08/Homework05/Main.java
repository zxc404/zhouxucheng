package chapter08.Homework05;

public class Main {

    public static void main(String[] args) {

//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(19);
//        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getCount());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
    }
}
