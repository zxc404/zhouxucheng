public class Demo08{
	public static void main(String[] args) {
		
		int x = 5;
		int y = 5;
		if(x++==6 & ++y==6){//x==6 false;x++;++y;y==6
			x = 11;
		}
		System.out.println("x = "+x+",y = "+y);//x=6;y=6
		
		x = 5; y = 5;
		if(x++==6 && ++y==6){//x==6 false x++;
			x = 11;
		}
		System.out.println("x = "+x+",y = "+y);//x=6;y=5

		x = 5; y = 5;
		if(x++==5 | ++y==5){//x==5 true x++;++y;y==5;x=11
			x = 11;
		}
		System.out.println("x = "+x+",y = "+y);//x=11;y=6

		x = 5; y = 5;
		if(x++==5 || ++y==5){//x==5 true x++;x=11
			x = 11;
		}
		System.out.println("x = "+x+",y = "+y);//x=11;y==5
	}
}