// for循环课堂练习1
// 把1-100中9的整数倍输出并输出个数，并求和
public class Demo12{

	public static void main(String[] args) {
		
		int j=0,sum = 0;
		for(int i=1;i<=100;i++){
			if(i % 9 == 0){
				System.out.println(i);
				j++;sum+=i;
			}
		}
		System.out.println("1-100中9的整数倍个数为：" + j);
		System.out.println("sum：" + sum);
	}
}