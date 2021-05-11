// while循环习题2
// 打印40-200中所有偶数
public class Demo14{

	public static void main(String[] args){

		int i=40;
		while(i<=200){
			if(i%2 == 0){
				System.out.println(i);
			}
			i++;
		}
	}
}