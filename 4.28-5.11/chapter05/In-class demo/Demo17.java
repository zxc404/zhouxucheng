// 多重循环控制：打印空心金字塔
// 
import java.util.Scanner;
public class Demo17{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("金字塔层数：");
		int m = sc.nextInt();

		for(int i=1;i<=m;i++){
			for(int j=1;j<=(m-i);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++){
				if(k == 1 || k == (2*i-1) || i == m){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}