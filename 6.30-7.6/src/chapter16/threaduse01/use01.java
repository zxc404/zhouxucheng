package chapter16.threaduse01;

/**
 * @author Zxc
 * @version 1.0
 */
public class use01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
        while (true) {
            System.out.println("main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Cat extends Thread{

    int times=0;
//    run方法是重写了Runnable接口的run方法
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵叫~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            times++;
            if(times==15)break;
        }
    }
}