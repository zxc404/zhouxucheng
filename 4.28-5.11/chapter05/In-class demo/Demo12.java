// forѭ��������ϰ1
// ��1-100��9���������������������������
public class Demo12{

	public static void main(String[] args) {
		
		int j=0,sum = 0;
		for(int i=1;i<=100;i++){
			if(i % 9 == 0){
				System.out.println(i);
				j++;sum+=i;
			}
		}
		System.out.println("1-100��9������������Ϊ��" + j);
		System.out.println("sum��" + sum);
	}
}