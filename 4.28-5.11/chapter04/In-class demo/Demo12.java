import java.util.Scanner;
public class Demo12{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input name : ");
		String name = scanner.next();
		System.out.print("input age : ");
		int age = scanner.nextInt();
		System.out.print("input salary : ");
		double salary = scanner.nextDouble();
		System.out.println("information : ");
		System.out.print("name : " + name + " age : " + age 
						+ " salary : " + salary);

	}
}