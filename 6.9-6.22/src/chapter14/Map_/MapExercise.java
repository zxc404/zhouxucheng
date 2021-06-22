package chapter14.Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Zxc
 * @version 1.0
 */
public class MapExercise {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1,new Employee("jack",10000,1));
        map.put(2,new Employee("mike",30000,2));
        map.put(3,new Employee("smith",100000,3));
        Set set = map.entrySet();
        for (Object o : set) {
            Map.Entry en = (Map.Entry)o;
            Employee t = (Employee) en.getValue();
            if(t.getSalary()>18000){
                System.out.println(t);
            }
        }
        System.out.println("======================");
        Collection values = map.values();
        for (Object o :values) {
            Employee t = (Employee)o;
            if(t.getSalary()>18000){
                System.out.println(t);
            }
        }
        System.out.println("======================");
        Set set1 = map.keySet();
        for (Object o :set1) {
            Employee t = (Employee)map.get(o);
            if(t.getSalary()>18000){
                System.out.println(t);
            }
        }


    }
}

class Employee{

    private String name;
    private double salary;
    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
}
