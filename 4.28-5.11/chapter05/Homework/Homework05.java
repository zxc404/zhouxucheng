// ��������ҵ04��
// ��̴���ʵ���������ݣ�
// 	���Сдa-z�ʹ�дZ-A
public class Homework05{

	public static void main(String[] args) {
		
		char a = 'a';
		do{
			System.out.print(a + " ");
			a++;
		}while(a <= 'z');
		System.out.println("");
		a = 'Z';
		do{
			System.out.print(a + " ");
			a--;
		}while(a >= 'A');
	}
}