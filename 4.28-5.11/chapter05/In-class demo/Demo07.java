// ���֧������ʾ
// �������뱣��ͬ־��֥�����÷֣���
// ���÷�=100�������¼��ã���<=99��>80��������һ�㣻
// ��<=80��>=60�������º�һ�㣻�������������£�����
import java.util.Scanner;
public class Demo07{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("���������÷�Ϊ��");
		double a = sc.nextDouble();
		if(a == 100){
			System.out.println("��¼��ã�");
		}else if(a<=99 && a>80){
			System.out.println("���һ�㣡");
		}else if(a<=80 && a>=60){
			System.out.println("��º�һ�㣡");
		}else {
			System.out.println("������£�����");
		}
	}
}