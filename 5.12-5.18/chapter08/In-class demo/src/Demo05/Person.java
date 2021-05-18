package Demo05;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void say(Person p){
        System.out.println("我的名字是" + p.getName()
                            + "，今年" + p.getAge() + "岁了。");
    }
}
