package chapter08.Homework07;

public class Main {

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("Peter", 38,
                "外科医生", '男', 12233.4);
        Doctor doctor2 = new Doctor("Peter", 38,
                "外科医生", '女', 12233.4);
        System.out.println(doctor1.equals(doctor2));
    }
}
