package Demo03;

public class Test {

    public static void main(String[] args) {

        Pupil pupil = new Pupil();
        pupil.name="彬彬";
        pupil.age=10;
        pupil.setScore(80);
        pupil.testing();
        pupil.show();

        Graduate graduate = new Graduate();
        graduate.name="杰哥";
        graduate.age=22;
        graduate.setScore(0);
        graduate.testing();
        graduate.show();
    }
}
