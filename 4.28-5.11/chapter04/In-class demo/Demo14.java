public class Demo14{
	
	public static void main(String[] args){

		// 2:00000000 000000000 00000000 00000010
		// 3:00000000 000000000 00000000 00000011
		// 2&3:00000000 00000000 00000000 00000010:2
		System.out.println(2 & 3);//2

		//-2:10000000 00000000 00000000 00000010
		// ���룺11111111 11111111 11111111 11111101
		// ���룺11111111 11111111 11111111 11111110
		// ~-2:00000000 00000000 00000000 00000001:1
		System.out.println(~ -2);//1

		//2:00000000 000000000 00000000 00000010
		//~2:11111111 11111111 11111111 11111101
		//����:11111111 11111111 11111111 11111100
		//ԭ��:10000000 00000000 00000000 00000011:-3
		System.out.println(~2);//-3
	}
}