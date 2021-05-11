// 第五章作业02：
// 	编程实现下列功能：
// 判断一个整数：大于0 小于0 等于0
import java.util.Scanner;
public class Homework02{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a = sc.nextInt();
		if(a>0){
			System.out.print("大于0");
		}else if(a == 0){
			System.out.print("等于0");
		}else{
			System.out.print("小于0");
		}
	}
}