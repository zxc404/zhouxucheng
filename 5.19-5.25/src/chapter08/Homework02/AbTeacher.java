package chapter08.Homework02;

public class AbTeacher extends Teacher{
    public AbTeacher(String name, int age) {
        super(name, age);
        this.setPost("讲师");
        this.setSalary(1.1);
    }

    @Override
    public void introduce() {
        System.out.println("AbTeacher" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", post='" + this.getPost() + '\'' +
                ", salary=" + this.getSalary());
    }
}
