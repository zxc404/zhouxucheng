// ��7����ҵ3
// ��д��Book�����巽��updatePrice��ʵ�ָ���ĳ����ļ۸�
// ����۸�>150������۸�>100������Ϊ100�����򲻱�

public class Homework03{

	public static void main(String[] args) {
		
		Book b1 = new Book(179);
		Book b2 = new Book(19);
		Book b3 = new Book(79);
		Book b4 = new Book(139);
		Book b5 = new Book(169);
		Book b6 = new Book(17);
		Book b7 = new Book(199);
		updatePrice(b1);
		updatePrice(b2);
		updatePrice(b3);
		updatePrice(b4);
		updatePrice(b5);
		updatePrice(b6);
		updatePrice(b7);
		System.out.println(b1.price);
		System.out.println(b2.price);
		System.out.println(b3.price);
		System.out.println(b4.price);
		System.out.println(b5.price);
		System.out.println(b6.price);
		System.out.println(b7.price);
	}

	public static void updatePrice(Book b){
		if(b.price>150){
			b.price = 150;
		}else if(b.price>100){
			b.price = 100;
		}
	}
}

class Book{

	int price;

	 public Book(int p){
		this.price = p;
	}

	
}