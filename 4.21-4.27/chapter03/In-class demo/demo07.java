public class demo07{
	public static void main(String[] args) {
		
		int n1 = (int)1.9;
		System.out.println("n1="+n1);//1

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1="+b1);

		//int x = (int)10*3.5+1.5 ;
		// error: only let 10 convert to int
		int x = (int)(10*3.5+1.5) ;
		System.out.println(x);

		char c1 = 100;
		int n3 = 100;
		//char c2 = n3;error
		char c3 = (char)n3;
		System.out.println(c3);//output d
	}
}