package Demo05;

public class Student extends Person {

    private long id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void say(Student p){
        System.out.println("我的名字是" + p.getName()
                + "，今年" + p.getAge()
                + "岁了。我的ID是"
                + p.getId() +"，我的分数是"
                + p.getScore() + "。");
    }
}
