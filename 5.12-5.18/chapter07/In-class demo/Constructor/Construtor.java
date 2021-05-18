// ¹¹ÔìÆ÷test

public class Construtor{

	public static void main(String[] args) {
		
		Person peter = new Person("peter",25);
		System.out.println(peter.name);
		System.out.println(peter.age);
	}
}

class Person{

	String name;
	int age;

	public Person(String name1,int age1){

		name = name1;
		age = age1;
	}
}