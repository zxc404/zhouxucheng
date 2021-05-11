// 第五章作业03：
// 	编程实现下列功能：
// 水仙花数：三位数，各位立方之和等于本身
import java.util.Scanner;
public class Homework03{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个三位数：");
		int a = sc.nextInt();
		int b = a / 100;
		int c = (a - b*100) / 10;
		int d = a - b*100 - c*10;
		if(a == b*b*b+c*c*c+d*d*d){
			System.out.print("是水仙花数。");
		}else{
			System.out.print("不是水仙花数。");
		}
	}
}