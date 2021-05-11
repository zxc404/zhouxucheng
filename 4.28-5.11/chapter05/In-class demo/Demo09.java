// switch语句案例
// 
import java.util.Scanner;
public class Demo09{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符：");
		char c = sc.next().charAt(0);
		switch(c){
			case 'a'://case后面必须是常量不能是变量
				System.out.println("第一个字母是a。");
				break;
			case 'b':
				System.out.println("第一个字母是b。");
				break;
			case 'c':
				System.out.println("第一个字母是c。");
				break;
			case 'd':
				System.out.println("第一个字母是d。");
				break;
			default	:
				System.out.println("无匹配项。");
				// 有无break都可以。
		}

	}
}