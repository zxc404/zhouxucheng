// ��д����Stringת����double���͵���䣬
// �Լ���char����ת����String����䣬����˵�����ɡ�
public class Homework03{

	public static void main(String[] args){

		String s = "18.0";
		double d = Double.parseDouble(s);
		char c = 'a';
		s = c + "";
		System.out.println(d);
		System.out.println(s);
	}
}