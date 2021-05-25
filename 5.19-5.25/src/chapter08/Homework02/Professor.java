package chapter08.Homework02;

public class Professor extends Teacher{

    public Professor(String name, int age) {
        super(name, age);
        this.setPost("教授");
        this.setSalary(1.3);
    }

    @Override
    public void introduce() {
        System.out.println("Professor" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", post='" + this.getPost() + '\'' +
                ", salary=" + this.getSalary());
    }
    }

