// ��7����ҵ8
// Tom�͵��Բ�ȭ����������
import java.util.Scanner;
public class Homework08{

	public static void main(String[] args) {
		
		Person Tom = new Person("Tom");
		Person Com = new Person("Computer");
		int times=0;
		System.out.print("TIMES = ");
		times = new Scanner(System.in).nextInt();
		System.out.println("Tom" + "\t" + "Computer" +"\t" + "���");
		for(int i = 1;i <= times;i++){
			Tom.compare(Tom.random1(),Com.random1());
		}

	}
}

class Person{

	String name;

	public Person(String name){
		this.name = name;
	}

	public int random1(){
		return ((int)(Math.random()*3));
	}

	public void compare(int tom,int com){
		String stom,scom;
		if(tom == 0){
			stom = "ʯͷ";
		}else{
			stom = tom==1?"����":"��";
		}
		if(com == 0){
			scom = "ʯͷ";
		}else{
			scom = com==1?"����":"��";
		}

		String res;
		if(tom == com){
			res="ƽ��";
		}else if(tom-com==1||com-tom == 2){
			res = "���Ի�ʤ";
		}else{
			res = "Tom��ʤ";
		}

		System.out.println(stom  + "\t" + scom + "\t" + res);
	}
}