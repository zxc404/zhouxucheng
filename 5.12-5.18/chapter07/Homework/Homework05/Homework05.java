// ��7����ҵ5
// ����һ��Բ��Circle���������԰뾶���ṩ��ʾ�ܳ�������ķ���

public class Homework05{

	public static void main(String[] args) {
		
		Circle c = new Circle(2.3);
		System.out.println("���Ϊ" + c.area(c));
		System.out.println("�ܳ�Ϊ" + c.girth(c));
	}
}

class Circle{

	double r;

	public Circle(double r){
		this.r = r;
	}

	public double area(Circle c){
		return Math.PI*c.r*c.r;
	}

	public double girth(Circle c){
		return 2*Math.PI*c.r;
	}
}