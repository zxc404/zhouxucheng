// 数组练习1
// 创建一个char类型的26个元素的数组，分别放置A-Z，
// 再用for循环访问并打印
public class Demo01{

	public static void main(String[] args) {
		
		char a = 'A';
		char arry[] = new char[26];
		for(int i = 0;i <= 25 ;i++,a++){
			arry[i] = a;
			System.out.print(arry[i] + " ");
		}
	}
}