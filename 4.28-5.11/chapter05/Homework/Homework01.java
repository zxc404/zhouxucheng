// ��������ҵ01��
// 	���ʵ�����й��ܣ�
// 	ĳ����100000Ԫ��ÿ����һ��·�ڱ�Ҫ���ѣ�
// 	1���ֽ�>50000ʱ��5%
// 	2��<=50000ʱ��1000
// 	����ɾ�������·�ڣ���while break���
public class Homework01{

	public static void main(String[] args) {
		
		int m = 100000;
		int i = 0;
		while(m>=1000){
			if(m > 50000){
				m -= (m * 0.05);
			}else{
				m -= 1000;
			}
			i++;
		}
		System.out.print("������" + i + "��·�ڡ�");
	}
}