// 数组练习2
// 求出一个数组int[]的最大值{4，-1,9,10,23}，并得到对应的index
public class Demo02{

	public static void main(String[] args) {
		
		int[] intArry = {4,-1,9,10,23};
		int ind = 0;
		int max = intArry[0];
		for(int i = 0 ; i < intArry.length ; i++){
			if(max < intArry[i]){
				max =  intArry[i];
				ind = i;
			}
		}
		System.out.print("max = " + max + " index = " + ind);
	}
}