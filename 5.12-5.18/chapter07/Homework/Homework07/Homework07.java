// ��7����ҵ7
// ���һ��Dog�࣬�����֡���ɫ���������ԣ�
// �����������shoW()��ʾ��Ϣ

public class Homework07{

	public static void main(String[] args) {
		
		Dog dog = new Dog("����","��ɫ",5);
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