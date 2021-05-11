//if语句入门
//编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁
// 则输出“你的年龄大于18岁，要对自己的行为负责。”
import java.util.Scanner;
public class Demo01{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年龄：");
		int age = sc.nextInt();
		if(age > 18){
			System.out.println("你的年龄大于18岁，要对自己的行为负责。");
		}
		System.out.println("代码继续执行！");
	}
		
}