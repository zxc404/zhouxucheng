// ��������ҵ04��
// ��̴���ʵ���������ݣ�
// 	���1-100֮�䲻�ܱ�5����������ÿ���һ��
public class Homework04{

	public static void main(String[] args){

		int j = 1;
		for(int i = 1;i <= 100;i++){
			if(j == 5 && i % 5 != 0){
				System.out.println(i);
				j=1;
			}else if(i % 5 != 0){
				System.out.print(i + " ");
				j++;
			}
		}
	}
}