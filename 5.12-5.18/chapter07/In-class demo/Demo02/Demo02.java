// 方法课堂练习
import java.util.Scanner;
public class Demo02{

	public static void main(String[] args) {
		
		Person wang = new Person();
		wang.name = "小王";
		wang.age = 28;
		wang.speak();
		wang.cal01();
		System.out.print("n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		wang.cal02(n);
		int sum = wang.getSum(n,n);
		System.out.println(sum);
	}
}
class Person{

	String name;
	int age;
	public void speak(){
		System.out.println("下午好");
	}
	public void cal01(){
		int sum=0;
		for(int i=0;i<=100;i++){
			sum += i ;
		}
		System.out.println(sum);
	}
	public void cal02(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum += i ;
		}
		System.out.println(sum);
	}
	public int getSum(int num1,int num2){
		int sum = num1 + num2;
		return sum;
	}
}