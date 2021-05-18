package Demo02;

public class Test {

    public static void main(String[] args) {

        Employee Tom = new Employee();
        Tom.setName("Tom");
        Tom.setAge(26);
        Tom.setGender('男');
        Tom.setSalary(12332.23);
        System.out.println(Tom.getName());
        System.out.println(Tom.getAge());
        System.out.println(Tom.getGender());
        System.out.println(Tom.getSalary());
    }
}
