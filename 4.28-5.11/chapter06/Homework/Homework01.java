//��6����ҵ1
// ��֪һ����������飬Ҫ�����һ������������Ȼ����
import java.util.Scanner;

public class Homework01{

	public static void main(String[] args) {
		
		int arr[] = {10,12,45,90};
		Scanner sc = new Scanner(System.in);
		String c;
		for(;;){
			System.out.print("������������y/n��");
			c = sc.next();
			if("y".equals(c)){
				System.out.print("��������ǣ�");
				int a = sc.nextInt();
				int arry[] = new int[arr.length + 1];
				int j = 0;
				for(int i = 0 ;i < arry.length;i++){
					if(j == arr.length || arr[j] > a){
						arry[i]=a;
						a = arr[arr.length-1];
					}else{
						arry[i]=arr[j];
						j++;
					}
				}
				arr = arry;
				for(int i = 0 ;i < arr.length;i++){
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}else break;
		}

	}
}