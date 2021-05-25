package chapter08.Homework01;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person("peter", 22, "worker");
        Person person2 = new Person("smith", 18, "student");
        Person person3 = new Person("james", 36, "teacher");
        Person[] person = {person1,person2,person3};
        for(int i=0;i<person.length;i++){
            for(int j = 0;j<person.length-1;j++){
                if(person[j].getAge()<person[j+1].getAge()){
                    Person person4 = person[j];
                    person[j]=person[j+1];
                    person[j+1]=person4;
                }
            }
        }
        for(int i=0;i<person.length;i++){
            System.out.println(person[i].toString());
        }
    }


}
