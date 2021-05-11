// 二维数组课堂练习1
// 遍历一个二维数组并得到和
public class Demo07{

	public static void main(String[] args) {
		
		int arr[][] = {{4,6},{1,4,5,7},{-2}};
		int sum = 0;
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j++){
				sum += arr[i][j];
			}
		}
		System.out.print(sum);
	}
}