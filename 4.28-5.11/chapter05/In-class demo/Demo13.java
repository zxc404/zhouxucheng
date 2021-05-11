// while循环习题1
// 打印1-100中所有能被3整除的数
public class Demo13{

	public static void main(String[] args){

		int i=1;
		while(i<=100){
			if(i%3 == 0){
				System.out.println(i);
			}
			i++;
		}
	}
}