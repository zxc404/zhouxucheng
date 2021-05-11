// 多重循环练习1
// 打印99乘法表
public class Demo16{

	public static void main(String[] args){
		int i = 1;
			for(int j = 1;j <=9 ; ){
				if(i == j){
					System.out.println(i + "*" + j + "=" + (i * j));
					i = 1;j++;
				}else{
					System.out.print(i + "*" + j + "=" + (i * j) + "  ");
					i++;
				}
			}
		}
	}
