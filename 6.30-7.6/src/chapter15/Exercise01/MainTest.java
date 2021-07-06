package chapter15.Exercise01;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Zxc
 * @version 1.0
 */
public class MainTest {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",12000,new MyDate(9,24,1999)));
        employees.add(new Employee("tom",8000,new MyDate(6,18,2000)));
        employees.add(new Employee("tom",7000,new MyDate(12,25,2000)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getName().equalsIgnoreCase(o2.getName())){
                    return o2.getBirthday().toString().compareTo(o1.getBirthday().toString());
                }
                else return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(employees);
    }
}
