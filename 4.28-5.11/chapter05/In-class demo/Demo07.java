// 多分支案例演示
// 键盘输入保国同志的芝麻信用分，若
// 信用分=100，输出武德极好；若<=99且>80，输出武德一般；
// 若<=80且>=60，输出武德很一般；否则输出不讲武德！！！
import java.util.Scanner;
public class Demo07{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("马保国的信用分为：");
		double a = sc.nextDouble();
		if(a == 100){
			System.out.println("武德极好！");
		}else if(a<=99 && a>80){
			System.out.println("武德一般！");
		}else if(a<=80 && a>=60){
			System.out.println("武德很一般！");
		}else {
			System.out.println("不讲武德！！！");
		}
	}
}