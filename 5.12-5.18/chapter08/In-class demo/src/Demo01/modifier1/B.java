package Demo01.modifier1;

public class B {

    public void say(){

        A a = new A();
//        在同一个包下可以访问public、
//        protected和默认的,不能访问private修饰的
        System.out.println("n1=" + a.n1 +
                " n2=" + a.n2 +" n3=" +a.n3);
    }
}
