package Demo08;

public class Worker extends Employee{
//    普通员工和经理继承了员工
    //    普通员工类多了work方法，
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工" + getName() +"working...");
    }

    @Override
    public double getAnnual(Employee e) {
        return super.getAnnual(e);
    }
}
