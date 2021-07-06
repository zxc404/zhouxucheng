package chapter16.homework02;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        User user = new User();
        new Thread(user).start();
        new Thread(user).start();
    }
}

class User implements Runnable{
    private static Card card = new Card(10000);
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (card.getMoney() <1000) {
                    System.out.println("余额不足");
                    return;
                }
                card.setMoney(card.getMoney() - 1000);
                System.out.println("余额" + card.getMoney());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Card{
    private  double money;

    public Card(double money) {
        this.money=money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
