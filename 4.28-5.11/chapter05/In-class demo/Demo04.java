// 单双分支练习题2
// 2.编写程序，声明2个double型变量并赋值。判断第一个数大于10.0
// 且第2个数小于20.0，打印两个数的和。
import java.util.Scanner;
public class Demo04{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		double d1 = sc.nextDouble();
		System.out.print("请输入第二个数字：");
		double d2 = sc.nextDouble();
		if(d1 > 10.0){
			if(d2 < 20.0){
				System.out.println(d1 + d2);
			}else{
				System.out.println("d2 >= 20.0");
			}
		}else{
				System.out.println("d1 <= 10.0");
			}
	}
}