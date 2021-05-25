package chapter08.Homework02;

public class SubProfessor extends Teacher{
    public SubProfessor(String name, int age) {
        super(name, age);
        this.setPost("副教授");
        this.setSalary(1.2);
    }
    @Override
    public void introduce() {
        System.out.println("SubProfessor" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", post='" + this.getPost() + '\'' +
                ", salary=" + this.getSalary());
    }
}
