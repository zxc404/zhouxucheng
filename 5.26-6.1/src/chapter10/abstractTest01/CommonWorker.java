package chapter10.abstractTest01;

public class CommonWorker extends Employee{

    public CommonWorker(String name, int id, double sal) {
        super(name, id, sal);
    }

    @Override
    public void work() {
        System.out.println("普通工人" + this.getName()
        + "正在工作...");
    }
}
