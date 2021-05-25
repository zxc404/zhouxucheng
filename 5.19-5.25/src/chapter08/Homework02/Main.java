package chapter08.Homework02;

public class Main {

    public static void main(String[] args) {

        Professor smith = new Professor("Smith", 57);
        SubProfessor peter = new SubProfessor("Peter", 46);
        AbTeacher jack = new AbTeacher("Jack", 32);
        smith.introduce();
        peter.introduce();
        jack.introduce();
    }
}
