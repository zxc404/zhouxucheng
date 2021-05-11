public class Demo01{
	public static void main(String[] args) {
		
		System.out.println(5 / 2);//2
		System.out.println(5.0 / 2);//2.5
		double d = 5 / 2;//2.0
		System.out.println(d);

		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1

		int i = 10;
		i++;
		System.out.println("i=" + i);//11
		++i;
		System.out.println("i=" + i);//12
		int j = 8;
		int k = ++j;//j = j + 1;k = j;
		System.out.println("k=" + k + "j=" + j);//9 9
		k = j++;//k = j;j = j + 1;
		System.out.println("k=" + k + "j=" + j);//9 10

	}
}