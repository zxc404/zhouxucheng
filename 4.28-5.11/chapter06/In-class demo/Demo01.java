// ������ϰ1
// ����һ��char���͵�26��Ԫ�ص����飬�ֱ����A-Z��
// ����forѭ�����ʲ���ӡ
public class Demo01{

	public static void main(String[] args) {
		
		char a = 'A';
		char arry[] = new char[26];
		for(int i = 0;i <= 25 ;i++,a++){
			arry[i] = a;
			System.out.print(arry[i] + " ");
		}
	}
}