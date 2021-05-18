// 第7章作业7
// 设计一个Dog类，有名字、颜色和年龄属性，
// 定义输出方法shoW()显示信息

public class Homework07{

	public static void main(String[] args) {
		
		Dog dog = new Dog("冰冰","白色",5);
		dog.show(dog);
	}
}

class Dog{

	String name;
	String color;
	int age;

	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(Dog d){
		System.out.println("name = " + d.name);
		System.out.println("color = " + d.color);
		System.out.println("age = " + d.age);
	}
}