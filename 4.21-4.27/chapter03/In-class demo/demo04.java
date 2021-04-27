public class demo04{
	public static void main(String[] args) {
		
		int n1 = 1;
		//int n2 = 1l;error
		long n3 = 1l;
		System.out.println(n1);
		System.out.println(n3);
		System.out.println("-------------------------");
		

		//float num1 = 1.1;error
		float num2 = 1.1f;
		double num3 = 1.1;
		double num4 = 1.1f;
		double num5 = .125;
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println("-------------------------");


		double a = 2.7;
		double b = 8.1/3;
		System.out.println(a==b?"yes":"no");
		System.out.println(Math.abs(a-b)<0.0001?"yes":"no");
	}
}