// 
// 
import java.util.Scanner;
public class Demo10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("������ɼ���");
		int c = sc.nextInt();
		int a = c / 60;
		switch (a){
			case 1:
				System.out.println("�ϸ�");
			break;
			case 0:
				System.out.println("���ϸ�");
			break;
			default:
				System.out.println("�����ʽ����");
		}

	}
}