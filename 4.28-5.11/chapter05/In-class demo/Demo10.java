// 
// 
import java.util.Scanner;
public class Demo10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int c = sc.nextInt();
		int a = c / 60;
		switch (a){
			case 1:
				System.out.println("合格");
			break;
			case 0:
				System.out.println("不合格");
			break;
			default:
				System.out.println("输入格式错误");
		}

	}
}