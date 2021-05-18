package Demo05;

public class Main {
//    编写一个Person类，包括shux/private(name,age)、
//    构造器、方法say（返回自我介绍的字符串）
//    编写一个Student类，继承Person类，增加id、score属性（priva）
//    以及构造器，定义say方法介绍自己的信息
//    分别创建对象并调用say方法输出

    public static void main(String[] args) {

        Person person = new Person("马保国", 45);
        Student student = new Student("杰哥", 28, 20210520, 78.7);
        person.say(person);
        student.say(student);
    }
}
