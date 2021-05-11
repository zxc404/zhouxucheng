// 单双支练习题4
// 判断是否是闰年
// (1)年份能被4整除，但不能被一百整除(2)能被400整除
import java.util.Scanner;
public class Demo06{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = sc.nextInt();
		if(year % 400 == 0){
			System.out.println("是闰年。");
		}else{
			if(year % 4 == 0 && year % 100 != 0){
				System.out.println("是闰年。");
			}else System.out.println("不是闰年。");
		}
	}
}