// 二维数组课堂练习2
// 杨辉三角
import java.util.Scanner;
public class Demo08{

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入杨辉三角的层数 ：");
		a = sc.nextInt();
		int arr[][] = new int[a][];
		for(int i = 0; i < arr.length; i++){
			arr[i] = new int[i+1];
				for(int j=0; j<arr[i].length;j++){
					if(j == 0 || j == arr[i].length-1){
						arr[i][j]=1;
					}else{
						arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
					}
				}
		}
		for(int i = 0; i < arr.length; i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}