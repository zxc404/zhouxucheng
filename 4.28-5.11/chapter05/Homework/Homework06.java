// 第五章作业04：
// 编程代码实现下列内容：
// 	求1-1/2+1/3-1/4···1/100的值
public class Homework06{

	public static void main(String[] args) {
		
		double s = 1;
		for(int i = 2;i <= 100;i++){
			s = s + Math.pow(-1,i-1)*1/i;
		}
		System.out.print(s);
	}
}