// 第五章作业04：
// 编程代码实现下列内容：
// 	输出1-100之间不能被5整除的数，每五个一行
public class Homework04{

	public static void main(String[] args){

		int j = 1;
		for(int i = 1;i <= 100;i++){
			if(j == 5 && i % 5 != 0){
				System.out.println(i);
				j=1;
			}else if(i % 5 != 0){
				System.out.print(i + " ");
				j++;
			}
		}
	}
}