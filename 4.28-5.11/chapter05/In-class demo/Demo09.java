// switch��䰸��
// 
import java.util.Scanner;
public class Demo09{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("������һ���ַ���");
		char c = sc.next().charAt(0);
		switch(c){
			case 'a'://case��������ǳ��������Ǳ���
				System.out.println("��һ����ĸ��a��");
				break;
			case 'b':
				System.out.println("��һ����ĸ��b��");
				break;
			case 'c':
				System.out.println("��һ����ĸ��c��");
				break;
			case 'd':
				System.out.println("��һ����ĸ��d��");
				break;
			default	:
				System.out.println("��ƥ���");
				// ����break�����ԡ�
		}

	}
}