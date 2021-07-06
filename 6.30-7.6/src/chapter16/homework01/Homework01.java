package chapter16.homework01;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

        new Thread(new Print(true)).start();
        new Thread(new Print(false)).start();
    }
}
class Print implements Runnable{

    boolean loop;
    Scanner sc = new Scanner(System.in);
    static boolean  sloop=true;

    public Print(boolean loop) {
        this.loop=loop;
    }

    @Override
    public void run() {
        if (loop){
            while (sloop) {
                System.out.println((int) (Math.random() * 100));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else {
            while (sloop){
                if (sc.next().equalsIgnoreCase("q")){
                    sloop=false;
                }
            }
        }
    }
}
