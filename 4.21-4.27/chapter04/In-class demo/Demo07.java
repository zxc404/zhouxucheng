public class Demo07{
	public static void main(String[] args) {
		
		int a = 9 ;
		int b = 99 ;
		if(a < 8 && ++b < 100){
			System.out.println("ok");
		}
		System.out.print("a =" + a + "b = " + b);
		

		if(a < 8 & ++b < 100){
			System.out.println("ok");
		}
		System.out.print("a =" + a + "b = " + b);

	}
}