// break��ϰ2
// 
import java.util.Scanner;
public class Demo20{

	public static void main(String[] args) {
		
		String name = "";
		String password = "";
		int i = 1;
		Scanner sc = new Scanner(System.in);
		for(;;i++){
			System.out.print("������������");
			name = sc.next();
			System.out.print("���������룺");
			password = sc.next();
			if("���ǳ�".equals(name) && "666".equals(password)){
				break;
			}else{
				System.out.println("������" + (10-i) + "�λ��ᡣ");
			}
		}
		System.out.print("��½�ɹ���");
	}
}