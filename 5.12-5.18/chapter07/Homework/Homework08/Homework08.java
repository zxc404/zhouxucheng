// 第7章作业8
// Tom和电脑猜拳，并输出结果
import java.util.Scanner;
public class Homework08{

	public static void main(String[] args) {
		
		Person Tom = new Person("Tom");
		Person Com = new Person("Computer");
		int times=0;
		System.out.print("TIMES = ");
		times = new Scanner(System.in).nextInt();
		System.out.println("Tom" + "\t" + "Computer" +"\t" + "结果");
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
			stom = "石头";
		}else{
			stom = tom==1?"剪刀":"布";
		}
		if(com == 0){
			scom = "石头";
		}else{
			scom = com==1?"剪刀":"布";
		}

		String res;
		if(tom == com){
			res="平局";
		}else if(tom-com==1||com-tom == 2){
			res = "电脑获胜";
		}else{
			res = "Tom获胜";
		}

		System.out.println(stom  + "\t" + scom + "\t" + res);
	}
}