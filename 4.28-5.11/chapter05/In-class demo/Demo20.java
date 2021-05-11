// break练习2
// 
import java.util.Scanner;
public class Demo20{

	public static void main(String[] args) {
		
		String name = "";
		String password = "";
		int i = 1;
		Scanner sc = new Scanner(System.in);
		for(;;i++){
			System.out.print("请输入姓名：");
			name = sc.next();
			System.out.print("请输入密码：");
			password = sc.next();
			if("周星驰".equals(name) && "666".equals(password)){
				break;
			}else{
				System.out.println("您还有" + (10-i) + "次机会。");
			}
		}
		System.out.print("登陆成功！");
	}
}