public class demo06{
	public static void main(String[] args) {
		
		int n1 = 10;
		//float d1 = n1 + 1.1;  error: n1 + 1.1→double
		//double d1 = n1 + 1.1; right
		float d1 = n1 + 1.1f;

		byte b1 = 10;
		int n2 = 1;
		//byte b2 = n2; error

		//char c1 = b1; error

		byte b2 = 1;
		byte b3 = 2;
		// byte b4 = b2 + b3;  error
		//b2 + b3 autoconvert to int
		int n4 = b2 + b3;
		System.out.println(n4);
		

		byte b4 = 1;
		short s3 = 100;
		int n5 = 1;
		double d2 = 1.1;
		double d3 = d2 + b4 + s3 + n5;
		System.out.println(d3);
	}
}