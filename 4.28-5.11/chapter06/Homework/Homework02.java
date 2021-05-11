// 第六章数组作业2
// 随机生成10个整数（1~100）保存到数组，并倒序打印求平均值、
// 最大值和最小值的下标，并查找有无8这个数。
public class Homework02{

	public static void main(String[] args) {
		
		int arry[] = new int[10];
		for (int i = 0; i <arry.length;i++){
			arry[i] = (int)(Math.random()*100)+1;
		}
		int max = 0,min = 0,sum = 0,check = 0;
		for (int i = arry.length - 1;i >=0 ; i--){
			System.out.print(arry[i] + " ");
			sum += arry[i];
			max = arry[max]>=arry[i]?max:i;
			min = arry[min]>=arry[i]?i:min;
			check = arry[i] == 8 ? 1 : 0;
		}
		System.out.println();
		System.out.println(check);
		System.out.println("average = " + (sum/arry.length));
		System.out.println("maxindex = " + max);
		System.out.println("minindex = " + min);
	}
}