// ��˫��֧��ϰ��2
// 2.��д��������2��double�ͱ�������ֵ���жϵ�һ��������10.0
// �ҵ�2����С��20.0����ӡ�������ĺ͡�
import java.util.Scanner;
public class Demo04{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		double d1 = sc.nextDouble();
		System.out.print("������ڶ������֣�");
		double d2 = sc.nextDouble();
		if(d1 > 10.0){
			if(d2 < 20.0){
				System.out.println(d1 + d2);
			}else{
				System.out.println("d2 >= 20.0");
			}
		}else{
				System.out.println("d1 <= 10.0");
			}
	}
}