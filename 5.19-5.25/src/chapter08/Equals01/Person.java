package chapter08.Equals01;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object person){
        if(this == person){
            return true;
        }else if(person instanceof Person){
            Person person1 = (Person)person;
            return this.name.equals(person1.name)&&
                    this.gender == person1.gender&&
                    this.age == person1.age;
        }
        return false;
    }
}
