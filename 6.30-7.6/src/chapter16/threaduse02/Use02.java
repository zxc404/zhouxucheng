package chapter16.threaduse02;

/**
 * @author Zxc
 * @version 1.0
 */
public class Use02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        new Thread(dog).start();
    }
}
class Dog implements Runnable{

    int times=0;
    //    run方法是重写了Runnable接口的run方法
    @Override
    public void run() {
        while (true) {
            System.out.println("旺旺叫~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            times++;
            if(times==85)break;
        }
    }
}