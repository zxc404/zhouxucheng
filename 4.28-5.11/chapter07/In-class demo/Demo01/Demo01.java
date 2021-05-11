// 
// 
public class Demo01{

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.age = 3;
		cat1.name = "点点";
		cat1.color = "三花";
		System.out.println(cat1.name);
		System.out.println(cat1.age);
		System.out.println(cat1.color);
	}
}
class Cat{
	int age;
	String name;
	String color;
}