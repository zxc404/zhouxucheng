// 第7章作业6
// 创建一个Cale计算类，定义两个操作数，四个方法
//加减乘除，除数为0时要提醒，创建两个对象，分别测试

public class Homework06{

	public static void main(String[] args) {
		
		Cale c1 = new Cale(2.4,5);
		Cale c2 = new Cale(2.4,0);
		System.out.println(c1.plus(c1));
		System.out.println(c2.plus(c2));
		System.out.println(c1.sub(c1));
		System.out.println(c2.sub(c2));
		System.out.println(c1.mul(c1));
		System.out.println(c2.mul(c2));
		System.out.println(c1.div(c1));
		System.out.println(c2.div(c2));
		
	}
}

class Cale{

	double a;
	double b;

	public Cale(double a,double b){
		this.a = a;
		this.b = b;
	}

	public double plus(Cale c1){
		return c1.a+c1.b;
	}

	public double sub(Cale c1){
		return c1.a-c1.b;
	}

	public double mul(Cale c1){
		return c1.a*c1.b;
	}

	public double div(Cale c1){
		if(c1.b!=0){
			return c1.a/c1.b;
		}else{
			System.out.print("除数为0啦！");
			return c1.a;
		}
		
	}
}