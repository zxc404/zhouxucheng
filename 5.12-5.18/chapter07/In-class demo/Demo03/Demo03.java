// ¿ËÂ¡¶ÔÏó
public class Demo03{

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "wpc";
		p.age = 24;
		Tool t = new Tool();
		Person pc = t.copyPerson(p);
		System.out.print(p.name + " ");
		System.out.println(p.age + " ");
		System.out.print(pc.name + " ");
		System.out.println(pc.age + " ");
		System.out.println(p == pc);
	}
}

class Person{
	String name;
	int age;
}
class Tool{
	public Person copyPerson(Person p){
		Person pc = new Person();
		pc.name = p.name;
		pc.age = p.age;
		return pc;
	}
}