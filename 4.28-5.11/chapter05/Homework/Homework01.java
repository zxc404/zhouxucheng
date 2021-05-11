// 第五章作业01：
// 	编程实现下列功能：
// 	某人有100000元，每经过一个路口便要交费：
// 	1）现金>50000时交5%
// 	2）<=50000时交1000
// 	计算可经过多少路口，用while break语句
public class Homework01{

	public static void main(String[] args) {
		
		int m = 100000;
		int i = 0;
		while(m>=1000){
			if(m > 50000){
				m -= (m * 0.05);
			}else{
				m -= 1000;
			}
			i++;
		}
		System.out.print("经过了" + i + "个路口。");
	}
}