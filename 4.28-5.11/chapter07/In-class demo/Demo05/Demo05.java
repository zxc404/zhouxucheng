// 斐波那契数列1,1,2,3,5,8,13···
// 猴子吃桃，每天吃一半加一个，第10天剩一个，求之前的桃子数量
import java.util.Scanner;
public class Demo05{

	public static void main(String[] args) {
		
		System.out.println(fibonacci(6));
		System.out.print(peach(1));
	}

	static int fibonacci(int n){
		if (n == 1 || n == 2){
			return 1;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

	static int peach(int n){
		if(n == 10){
			return 1;
		}else{
			return (peach(n+1)+1)*2;
		}
	}
}