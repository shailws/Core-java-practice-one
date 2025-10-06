package Exceptionsss;

import java.io.FileInputStream;

public class Test {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:/abc.txt");
		}
		catch(Exception e) {
//			e.printStackTrace();
			
//			System.out.println(e);
//			System.out.println(e.toString());
			
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
		//Class.forName("com.mysql.cj.jdbc.Driver");
//		int a=100, b=0;
//		int c = a/b;
//		System.out.println(c);
//		String name = null;
//		System.out.println(name.length());
		
		
	}
}
