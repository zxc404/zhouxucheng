package chapter10.abstractTest02;

public class B extends Templete{

    public B() {
    }

    @Override
    public void job() {
        long num = 0;
        for (long i = 0; i < 999999; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
