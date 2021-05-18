// 第7章作业4
// 编写类A03，实现数组的复制功能copyArr

public class Homework04{

	public static void main(String[] args) {
		
		A03 a = new A03();
		int[] arrInt = {1,2,3,4};
		int[] copyInt = a.copyArr(arrInt);
		for(int i=0;i<arrInt.length;i++){
			System.out.println(arrInt[i] + " " + copyInt[i]);
		}
	}
}

class A03{

	public int[] copyArr(int[] arr){
		int[] copyarr = new int[arr.length];
		for(int i = 0;i < arr.length;i++){
			copyarr[i] = arr[i];
		}
		return copyarr;
	}

	public byte[] copyArr(byte[] arr){
		byte[] copyarr = new byte[arr.length];
		for(int i = 0;i < arr.length;i++){
			copyarr[i] = arr[i];
		}
		return copyarr;
	}

	public double[] copyArr(double[] arr){
		double[] copyarr = new double[arr.length];
		for(int i = 0;i < arr.length;i++){
			copyarr[i] = arr[i];
		}
		return copyarr;
	}

	public String[] copyArr(String[] arr){
		String[] copyarr = new String[arr.length];
		for(int i = 0;i < arr.length;i++){
			copyarr[i] = arr[i];
		}
		return copyarr;
	}


}