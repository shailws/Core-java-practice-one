package Exceptionsss;

import java.io.FileInputStream;

public class FileCloseDemo {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:/abc.text");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
}
