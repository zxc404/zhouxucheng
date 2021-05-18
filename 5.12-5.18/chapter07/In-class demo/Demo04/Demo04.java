// ½×³Ë
public class Demo04{

	public static void main(String[] args) {
		
		System.out.print(factorial(4));
	}

	static int factorial(int n){
		if(n==1){
			return 1;
		}else{
			return factorial(n-1)*n;
		}
	}
}
