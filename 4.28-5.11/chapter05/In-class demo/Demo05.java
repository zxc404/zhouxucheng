// ��˫��֧��ϰ��3
// ������������int���ж϶��ߵĺͣ�
// �Ƿ��ܱ�3��5��������ӡ��ʾ��Ϣ
import java.util.Scanner;
public class Demo05{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("����1Ϊ��");
		int a = sc.nextInt();
		System.out.print("����1Ϊ��");
		int b = sc.nextInt();
		if((a + b)%3 == 0){
			if((a + b)%5 == 0){
				System.out.println("�ܱ�3��5������");
			}else{
				System.out.println("�ܱ�3����,���ܱ�5������");
			}
		}else{
				if((a + b)%5 == 0){
					System.out.println("�ܱ�5����,���ܱ�3����");
				}else{
					System.out.println("���ܱ�3��5������");
				}
			}
	}
}