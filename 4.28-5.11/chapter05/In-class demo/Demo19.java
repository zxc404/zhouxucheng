// break��ϰ1
//1-100���ڵ�����ͣ����͵�һ�δ���20ʱ�����������ǰ��
public class Demo19{

	public static void main(String[] args){

		int sum = 0 ;int i = 0;
		for(;i<=100;i++){
			sum += i;
			if(sum > 20)break;
		}
		System.out.print(i);
	}
} 