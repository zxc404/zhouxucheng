// ��������ҵ03��
// 	���ʵ�����й��ܣ�
// ˮ�ɻ�������λ������λ����֮�͵��ڱ���
import java.util.Scanner;
public class Homework03{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ����λ����");
		int a = sc.nextInt();
		int b = a / 100;
		int c = (a - b*100) / 10;
		int d = a - b*100 - c*10;
		if(a == b*b*b+c*c*c+d*d*d){
			System.out.print("��ˮ�ɻ�����");
		}else{
			System.out.print("����ˮ�ɻ�����");
		}
	}
}