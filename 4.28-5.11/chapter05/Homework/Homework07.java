// ��������ҵ04��
// ��̴���ʵ���������ݣ�
// 	��1+��1+2����������100��ֵ
public class Homework07{

	public static void main(String[] args) {
		
		int s = 0;
		int p = 0;
		for(int i = 1;i <= 100;i++){
			p+=i;
			s+=p;
		}
		System.out.print(s);
	}
}