// ��˫֧��ϰ��4
// �ж��Ƿ�������
// (1)����ܱ�4�����������ܱ�һ������(2)�ܱ�400����
import java.util.Scanner;
public class Demo06{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = sc.nextInt();
		if(year % 400 == 0){
			System.out.println("�����ꡣ");
		}else{
			if(year % 4 == 0 && year % 100 != 0){
				System.out.println("�����ꡣ");
			}else System.out.println("�������ꡣ");
		}
	}
}