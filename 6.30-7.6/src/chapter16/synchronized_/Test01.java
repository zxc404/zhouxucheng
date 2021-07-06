package chapter16.synchronized_;


/**
 * @author Zxc
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        new Thread(ticket1).start();
        new Thread(ticket1).start();
        new Thread(ticket1).start();
    }
}

class Ticket implements Runnable{
    private static int ticket = 100;
    public synchronized boolean sale(){
        if (ticket<=0){
            System.out.println("售票结束");
            return true;
        }
        ticket--;
        System.out.println("售出一张票,余票"+ticket+"张");

        return false;
    }

    public void run() {
        while (true){
            if (sale()){
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}