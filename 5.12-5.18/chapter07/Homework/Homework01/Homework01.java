// 第7章作业1
// 编写类A01，定义方法max，实现求某个double数组的最大值，并返回

public class Homework01{

	public static void main(String[] args) {
		
		A01 a = new A01();
		double[] d = {1.3,2.9,99.3,8289.3980,2992.2,28,28.8};
		System.out.print(a.max(d));
	}
}

class A01{

	public double max(double[] arr){

		double max = arr[0];
		for(int i = 0; i < arr.length;i++){
			max=max>arr[i]?max:arr[i];
		}
		return max;
	}
}