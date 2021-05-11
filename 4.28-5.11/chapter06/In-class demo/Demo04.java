// 数组课堂尝试
// 数据类型不一样的数组能传递地址吗
public class Demo04{

	public static void main(String[] args) {

		int[] intArr = {1,2,3};
		char[] charArr = {'6','5','4'};
		intArr = charArr;
		for(int i = 0 ; i < intArr.length ; i++){
			System.out.print(intArr[i] + " ");
		}	
	}
}	

