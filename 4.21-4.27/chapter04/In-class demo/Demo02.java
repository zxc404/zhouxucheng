public class Demo02{
	public static void main(String[] args) {
		
		int i = 1;
		i = i++;
		System.out.println(i);//temp = i;i = i + 1;i = temp;

		i = ++i;
		System.out.println(i);//i = i + 1;temp = i;i = temp;
	}
}