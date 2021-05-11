// 第六章数组作业3
// 编写代码说出结果
public class Homework03{

	public static void main(String[] args) {
		
		char[] arr1 = {'a','z','b','c'};
		char[] arr2 = arr1;
		arr1[2] = '马';
		for(int i = 0 ; i < arr2.length ; i++){
			System.out.println(arr1[i] + "," + arr2[i]);
		}
	}
}