package chapter15;

/**
 * @author Zxc
 * @version 1.0
 */
public class Generic02 {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Pig<A> pig = new Pig<>(new A());
        Pig<B> pig1 = new Pig<>(new B());
    }
}

class A{}
class B{}
class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public String getE() {
        return e.getClass()+"";
    }
}