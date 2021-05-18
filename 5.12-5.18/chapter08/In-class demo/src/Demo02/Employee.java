package Demo02;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee() {
    }

//    public Employee(String name,
//                    int age,
//                    char gender,
//                    double salary) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.salary = salary;
//    }
//
//    public Employee(String name,
//                    int age,
//                    char gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=10) {
            this.name = name;
        }else{
            System.out.println("名字的字符长度为2-10。");
            this.name="Peter";
        }
    }

    public void setAge(int age) {
        if(age>=1&&age<=120) {
            this.age = age;
        }else{
            System.out.println("年龄设置为0-120岁。");
            this.age=18;
        }
    }

    public void setGender(char gender) {
        if(gender=='男' || gender=='女') {
            this.gender = gender;
        }else{
            this.gender='男';
            System.out.println("性别请设置为男或女。");
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
