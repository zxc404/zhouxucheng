// 第7章作业2
// 编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引
// 如果找不到，返回-1

public class Homework02{

	public static void main(String[] args) {
		
		String[] str = {"数学","语文","英语","Java"};
		A02 a = new A02();
		System.out.print(a.find("Java",str));
	}
}

class A02{

	public int find(String s1,String[] str){

		int x=-1;
		for(int i =0;i < str.length;i++){
			x=s1.equals(str[i])?i:-1;
		}
		return x;
	}
}