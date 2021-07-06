package chapter16.threaduse03;

/**
 * @author Zxc
 * @version 1.0
 */
public class Use03 {
    public static void main(String[] args) throws InterruptedException {

        Hi hi = new Hi();
        hi.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main");
            Thread.sleep(1000);
            if (hi.time==5){
                hi.join();
            }
        }
    }
}
class Hi extends Thread{
    int time=0;
    @Override
    public void run() {
        while (true){
            System.out.println("hello"+(++time));
            if (time>=20)break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
