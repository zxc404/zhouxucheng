package chapter10.homework03;

/**
 * @author Zxc
 * @version 1.0
 */
public class Cellphone{

    public void testWork(Computer computer,int a,int b){
        computer.work(a,b);
    }
}

interface Computer{
    void work(int a,int b);
}