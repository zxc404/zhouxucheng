package Demo08;

public class Manager extends  Employee {
//    理多了奖金bonus属性
    //    和管理manage方法，
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }


    @Override
    public double getAnnual(Employee e) {
        return super.getAnnual(e) + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理" + getName() + "managing...");
    }
}
