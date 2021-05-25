package chapter08.Homework08;

public class Teacher extends Person{

    private int work_age;

    public Teacher(String name, char sex,
                   int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println(getName() +"认真教学！");
    }

    @Override
    public void play() {
        System.out.println(getName() + "爱玩象棋。");
    }
}
