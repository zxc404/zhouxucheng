// 第五章作业04：
// 编程代码实现下列内容：
// 	求1+（1+2）···到100的值
public class Homework07{

	public static void main(String[] args) {
		
		int s = 0;
		int p = 0;
		for(int i = 1;i <= 100;i++){
			p+=i;
			s+=p;
		}
		System.out.print(s);
	}
}