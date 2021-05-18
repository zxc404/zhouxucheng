package Demo03;

public class Student {

    public String name;
    int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void show(){
        System.out.println("学生名" + name
                +" 年龄" + age
                + "成绩" + score);
    }
}
