package chapter10.homework03;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        new Cellphone().testWork(new Computer() {
            @Override
            public void work(int a,int b) {
                System.out.println(a+" + "+b+" = "+(a+b));
            }
        },1,5);
    }
}
