package chapter08.Homework08;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mr.wang",
                '男', 36, 8);
        Teacher teacher2 = new Teacher("Miss.lee",
                '女', 28, 3);
        Student peter = new Student("Peter",
                '男', 18, "123456789");
        Student mary = new Student("Mary",
                '女', 17, "2344567890");

        Person[] person = {mary,teacher1,teacher2,peter};
        for(int i=0;i<person.length;i++){
            for (int j=0;j<person.length-1;j++){
                if(person[j].getAge()<person[j+1].getAge()){
                    Person temp = person[j];
                    person[j] = person[j+1];
                    person[j+1]=temp;
                }
            }
        }
        Main main = new Main();
        for (int i = 0; i < person.length; i++) {
            main.show(person[i]);
        }

    }
    public void show(Person person){
        if(person instanceof Teacher){
            ((Teacher) person).teach();
        }else if(person instanceof Student){
            ((Student) person).study();
        }else System.out.println("error");
    }
}
