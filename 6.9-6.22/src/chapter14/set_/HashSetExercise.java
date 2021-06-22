package chapter14.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author Zxc
 * @version 1.0
 */
public class HashSetExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack",27));
        hashSet.add(new Employee("mike",22));
        hashSet.add(new Employee("mike",32));
        hashSet.add(new Employee("jack",27));
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj.toString());
        }

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
