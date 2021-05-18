// 第7章作业5
// 定义一个圆类Circle，定义属性半径，提供显示周长和面积的方法

public class Homework05{

	public static void main(String[] args) {
		
		Circle c = new Circle(2.3);
		System.out.println("面积为" + c.area(c));
		System.out.println("周长为" + c.girth(c));
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