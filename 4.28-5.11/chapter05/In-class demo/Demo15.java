// do-while������ϰ3
// ͳ��1-200���ܱ�5���������ܱ�3�����ĸ���
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