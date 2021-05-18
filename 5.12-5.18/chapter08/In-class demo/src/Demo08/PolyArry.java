package Demo08;

public class PolyArry {
//    定义员工类Emoloyee，含姓名和月工资，以及计算
//    年工资getAnnual方法，普通员工和经理继承了员工
//    普通员工类多了work方法，经理多了奖金bonus属性
//    和管理manage方法，两者都重写getAnnual方法
//    测试类中添加一个方法showEmpAnnual（Employee e）
//    实现获取任何员工对象的年工资，并在main方法中调用该方法
//    测试类中添加一个方法，testWork，如果是普通员工，
//    则调用work方法，经理这调用manage方法

    public static void main(String[] args) {

        Worker peter = new Worker("Peter", 6666.66);
        Manager smith = new Manager("Smith", 28888.88, 50000);
        Test test = new Test();
        test.showEmpAnnual(peter);
        test.showEmpAnnual(smith);
        test.testWork(peter);
        test.testWork(smith);
        "dk".equals("he");
    }

}

class Test{

    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual(e));
    }

    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
