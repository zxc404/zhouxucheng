package chapter15;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test01 {

    public static void main(String[] args) {
        new Car().drive("benz",new Ca<>());
        new Ca<Long>().run(1123230L);
    }
}

class Car{

    public <T,R> void drive(T t,R r){
        System.out.println(t.getClass().getSimpleName());
        System.out.println(r.getClass().getSimpleName());
    }

    @Test
    public void test(){
        System.out.println("JUnit~");
    }
}

class Ca<E> {

    public void run(E e){
        System.out.println(e.getClass().getSimpleName());
    }
}
