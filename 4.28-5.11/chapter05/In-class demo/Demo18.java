// ����ѭ�����ƣ���ӡ��������
// 
import java.util.Scanner;
public class Demo18{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("���β�����");
		int m = sc.nextInt();

		for(int i=1;i<=m;i++){
			for(int j=1;j<=(m-i);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++){
				if(k == 1 || k == (2*i-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
		for(int i=m-1;i>=1;i--){
			for(int j=1;j<=(m-i);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++){
				if(k == 1 || k == (2*i-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}