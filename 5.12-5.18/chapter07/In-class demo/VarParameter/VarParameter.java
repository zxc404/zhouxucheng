// 可变参数方法案例
public class VarParameter{

	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t.sum(1,2,3,4));
		System.out.println(t.sum(1,2,3));
		System.out.println(t.sum(1,2));

	}
}

class Test{

	public int sum(int... nums){
	//表示接收的类型是int，参数不限，nums当做数组来使用
		int sum = 0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		return sum;
	}
}