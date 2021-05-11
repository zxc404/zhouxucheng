// 试写出将String转换成double类型的语句，
// 以及将char类型转换成String的语句，举例说明即可。
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