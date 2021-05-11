// 第六章数组作业4
// 冒泡排序算法
// 冒泡排序,由小到大
public class Homework04{

	public static void main(String[] args) {
		
		int[] arr = {24,69,80,57,13};
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr.length-1;j++){
				int b ;
				b = arr[j]<arr[j+1]?arr[j+1]:arr[j];
				if(b == arr[j]){
					arr[j] = arr[j+1];
					arr[j+1] = b;
				}
			}
		}
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}
}