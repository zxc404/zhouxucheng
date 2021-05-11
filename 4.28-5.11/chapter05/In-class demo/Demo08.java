// 嵌套分支案例
// 出票系统：根据淡旺季和年龄，打印票价：
// 4-10月为旺季：成人(18-60)：60元；
// 				儿童(<18)：半价；
// 				老人(>60)：1/3
// 淡季：成人：40元；其他：20元
import java.util.Scanner;
public class Demo08{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		System.out.print("请输入购票人年龄：");
		int age = sc.nextInt();
		if(month>=4 && month<=10){
			if(age>=18 && age<=60){
				System.out.println("您的票价为60元。");
			}else if(age>0 && age<18){
				System.out.println("您的票价为30元。");
			}else if(age>60){
				System.out.println("您的票价为20元。");
			}
		}else {
			if(age>=18 && age<=60){
				System.out.println("您的票价为40元。");
			}else{
				System.out.println("您的票价为20元。");
			}
		}
	}
}