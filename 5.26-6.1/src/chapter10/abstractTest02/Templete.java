package chapter10.abstractTest02;

public abstract class Templete {

    public abstract void job();

    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间为" +
                (end - start) + "ms");
    }
}
