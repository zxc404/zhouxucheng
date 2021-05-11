// switch分支练习3：
// 根据指定月份输出所属季节，3、4、5为春季···
import java.util.Scanner;
public class Demo11{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入月份：");
		int m = sc.nextInt();
		switch(m/3){
			case 1:
			System.out.println("所属季节为春季");
			break;
			case 2:
			System.out.println("所属季节为夏季");
			break;
			case 3:
			System.out.println("所属季节为秋季");
			break;
			default:
			System.out.println("所属季节为冬季");
			break;
				//也可以case 1:
				// case 2:
				// case 12:
				// System.out.println("所属季节为冬季");
			// 	break;
		}
	}
}