// 第五章作业04：
// 编程代码实现下列内容：
// 	输出小写a-z和大写Z-A
public class Homework05{

	public static void main(String[] args) {
		
		char a = 'a';
		do{
			System.out.print(a + " ");
			a++;
		}while(a <= 'z');
		System.out.println("");
		a = 'Z';
		do{
			System.out.print(a + " ");
			a--;
		}while(a >= 'A');
	}
}