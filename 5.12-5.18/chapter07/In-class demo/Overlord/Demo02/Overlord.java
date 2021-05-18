// ÖØÔØ¿ÎÌÃÁ·Ï°2
public class Overlord{

	public static void main(String[] args) {
		
		Test t = new Test();
		int a = 2,b=4;
		System.out.println(t.p(a,b));
		double d1 = 1.0,d2 = 2.0,d3 = 3.0;
		System.out.println(t.p(d1,d2));
		System.out.println(t.p(d1,d2,d3));
		
	}
}

class Test{


	public int p(int n1,int n2){
		return n1>n2?n1:n2;
	}

	public double p(double n1,double n2){
		return n1>n2?n1:n2;
	}

	public double p(double n1,double n2,double n3){
		n2=n2>n3?n2:n3;
		return n1>n2?n1:n2;
	}
}