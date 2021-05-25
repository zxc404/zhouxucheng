package chapter08.Homework08;

public class Student extends Person{

    private String stu_id;

    public Student(String name, char sex,
                   int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println(getName() +"好好学习！");
    }

    @Override
    public void play() {
        System.out.println(getName() + "爱玩足球。");
    }
}
