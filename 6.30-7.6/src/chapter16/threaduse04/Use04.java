package chapter16.threaduse04;

/**
 * @author Zxc
 * @version 1.0
 */
public class Use04 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);//设置成主线程的守护线程
        myDaemonThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程~");
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread extends Thread{
    @Override
    public void run() {

        for (;;){
            System.out.println("子线程~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
