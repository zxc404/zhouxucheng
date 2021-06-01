package chapter10.abstractTest01;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, int id, double sal, double bonus) {
        super(name, id, sal);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + this.getName() +
                "正在工作，奖金为" + bonus);
    }
}
