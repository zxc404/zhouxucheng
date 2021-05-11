// do-while课堂练习3
// 统计1-200间能被5整除但不能被3整除的个数
public class Demo15{

	public static void main(String[] args){

		int i = 1,j=0;
		do{
			if( i % 5 == 0 && i % 3 != 0 ){
				j++;
			}
			i++;
		}while(i<=200);
		System.out.print("count = " + j);
	}
}