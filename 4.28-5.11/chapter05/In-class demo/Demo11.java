// switch��֧��ϰ3��
// ����ָ���·�����������ڣ�3��4��5Ϊ����������
import java.util.Scanner;
public class Demo11{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int m = sc.nextInt();
		switch(m/3){
			case 1:
			System.out.println("��������Ϊ����");
			break;
			case 2:
			System.out.println("��������Ϊ�ļ�");
			break;
			case 3:
			System.out.println("��������Ϊ�＾");
			break;
			default:
			System.out.println("��������Ϊ����");
			break;
				//Ҳ����case 1:
				// case 2:
				// case 12:
				// System.out.println("��������Ϊ����");
			// 	break;
		}
	}
}