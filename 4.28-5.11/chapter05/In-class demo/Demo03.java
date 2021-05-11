// 单分支双分支练习题1
// 1.对下列代码，若有输出，指出输出结果
// int x = 7;
// 		int y = 4;
// 		if(x > 5){
// 			if(y > 5){
// 				System.outprintln(x + y);
// 			}
// 				System.out.println("x > 5就一定输出。");
// 		}else{
// 			System.out.println("x is " + x);
// 		}

public class Demo03{

	public static void main(String[] args){

		int x = 7;
		int y = 4;
		if(x > 5){
			if(y > 5){
				System.out.println(x + y);
			}
				System.out.println("x > 5就一定输出。");
		}else{
			System.out.println("x is " + x);
		}
	}
}