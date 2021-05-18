package Demo08;

public class Employee {
//    定义员工类Emoloyee，含姓名和月工资，以及计算
//    年工资getAnnual方法，

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual(Employee e){
        double annual = 12*e.getSalary();
//        System.out.println("年工资为：" + annual + "元。");
        return annual;
    }
}
