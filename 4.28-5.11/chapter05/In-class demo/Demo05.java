// 单双分支练习题3
// 定义两个变量int，判断二者的和，
// 是否能被3和5整除，打印提示信息
import java.util.Scanner;
public class Demo05{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("整数1为：");
		int a = sc.nextInt();
		System.out.print("整数1为：");
		int b = sc.nextInt();
		if((a + b)%3 == 0){
			if((a + b)%5 == 0){
				System.out.println("能被3和5整除。");
			}else{
				System.out.println("能被3整除,不能被5整除。");
			}
		}else{
				if((a + b)%5 == 0){
					System.out.println("能被5整除,不能被3整除");
				}else{
					System.out.println("不能被3和5整除。");
				}
			}
	}
}