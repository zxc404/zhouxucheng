// ������ϰ2
// ���һ������int[]�����ֵ{4��-1,9,10,23}�����õ���Ӧ��index
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