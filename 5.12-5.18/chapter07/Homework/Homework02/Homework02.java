// ��7����ҵ2
// ��д��A02�����巽��find��ʵ�ֲ���ĳ�ַ��������е�Ԫ�ز��ң�����������
// ����Ҳ���������-1

public class Homework02{

	public static void main(String[] args) {
		
		String[] str = {"��ѧ","����","Ӣ��","Java"};
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