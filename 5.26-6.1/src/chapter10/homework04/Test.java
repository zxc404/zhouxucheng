package chapter10.homework04;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        A jack = new A("jack");
        jack.show();
        A.B jackb = jack.new B("jackb");
        jackb.show();
    }
}

class A{

    private String name;

    public A(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("A:" + name);
        new B("innerb").show();
    }

    class B{
       private String name;

        B(String name) {
            this.name = name;
        }

        public void show(){
           System.out.println("B:"+name);
           System.out.println("A:"+A.this.name);
       }
    }
}