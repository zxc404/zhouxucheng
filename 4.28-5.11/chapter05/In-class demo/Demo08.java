// Ƕ�׷�֧����
// ��Ʊϵͳ�����ݵ����������䣬��ӡƱ�ۣ�
// 4-10��Ϊ����������(18-60)��60Ԫ��
// 				��ͯ(<18)����ۣ�
// 				����(>60)��1/3
// ���������ˣ�40Ԫ��������20Ԫ
import java.util.Scanner;
public class Demo08{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = sc.nextInt();
		System.out.print("�����빺Ʊ�����䣺");
		int age = sc.nextInt();
		if(month>=4 && month<=10){
			if(age>=18 && age<=60){
				System.out.println("����Ʊ��Ϊ60Ԫ��");
			}else if(age>0 && age<18){
				System.out.println("����Ʊ��Ϊ30Ԫ��");
			}else if(age>60){
				System.out.println("����Ʊ��Ϊ20Ԫ��");
			}
		}else {
			if(age>=18 && age<=60){
				System.out.println("����Ʊ��Ϊ40Ԫ��");
			}else{
				System.out.println("����Ʊ��Ϊ20Ԫ��");
			}
		}
	}
}