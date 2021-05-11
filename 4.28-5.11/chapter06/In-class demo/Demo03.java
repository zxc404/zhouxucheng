// 数组练习3
// 求出一个数组的和和平均值
public class Demo03{

	public static void main(String[] args) {
		
		int[] intArry = {4,-1,9,10,23};
		double ave;
		int sum = 0;
		for(int i = 0 ; i < intArry.length ; i++){
			sum += intArry[i];
		}
		ave = sum/intArry.length;
		System.out.print("sum = " + sum + " average = " + ave);
	}
}