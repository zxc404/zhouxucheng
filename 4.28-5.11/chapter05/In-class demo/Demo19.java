// break练习1
//1-100以内的数求和，当和第一次大于20时跳出并输出当前数
public class Demo19{

	public static void main(String[] args){

		int sum = 0 ;int i = 0;
		for(;i<=100;i++){
			sum += i;
			if(sum > 20)break;
		}
		System.out.print(i);
	}
} 