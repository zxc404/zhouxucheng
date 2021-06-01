package chapter10.innerclass.bell;

public class Test {

    public static void main(String[] args) {
        new Cellphone().alarm(new Bell() {
            @Override
            public void ring() {
                System.out.println("闹铃响了~~");
            }
        });
        System.out.println(new Bell() {
            @Override
            public void ring() {
                System.out.println("闹铃响了~~");
            }
        }.getClass());
    }
}

interface Bell{
    void ring();
}

class Cellphone{
    public void alarm(Bell bell){
        bell.ring();
    }
}
