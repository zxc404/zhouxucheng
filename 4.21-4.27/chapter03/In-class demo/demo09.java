public class demo09{
	public static void main(String[] args) {
		
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);

		int n2 = Integer.parseInt(s1);
		System.out.println(n2);
		float f2 = Float.parseFloat(s2);
		System.out.println(s2);//Double.parseDouble();
		//Long.parseLong();Byte.parseByte();
		//Boolean.parseBoolean();Short.parseShort();
		

	}
}