package chapter10.abstractTest02;

public class A extends Templete{

    public A() {
    }

    @Override
    public void job() {
        long num = 0;
        for (long i = 0; i < 800000; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
