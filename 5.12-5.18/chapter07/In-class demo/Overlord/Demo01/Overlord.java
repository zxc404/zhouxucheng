// ���ؿ�����ϰ1
public class Overlord{

	public static void main(String[] args) {
		
		Test t = new Test();
		t.p(2);
		int a = 2,b=4;
		t.p(a,b);
		t.p("�ܸ粻Ҫ");
	}
}

class Test{

	public void p(int n){
		System.out.println(n);
	}

	public void p(int n1,int n2){
		System.out.println(n1*n2);
	}

	public void p(String s){
		System.out.println(s);
	}
}