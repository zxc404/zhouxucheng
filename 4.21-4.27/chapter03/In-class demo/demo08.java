public class demo08{
	public static void main(String[] args) {
		
		short s = 12;
		//s=s-9;error

		byte b = 10;
		//b = b + 11;error
		b = (byte)(b + 11);//right
		System.out.println("b="+b);

		char c = 'a';
		int i = 16;
		float d = .314f;
		double result = c + i + d;//right
		System.out.println("result="+result);

		byte y = 16;
		short h = 14;
		//short t = h + y;error
	}
}