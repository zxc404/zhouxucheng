// ��������ҵ04��
// ��̴���ʵ���������ݣ�
// 	��1-1/2+1/3-1/4������1/100��ֵ
public class Homework06{

	public static void main(String[] args) {
		
		double s = 1;
		for(int i = 2;i <= 100;i++){
			s = s + Math.pow(-1,i-1)*1/i;
		}
		System.out.print(s);
	}
}